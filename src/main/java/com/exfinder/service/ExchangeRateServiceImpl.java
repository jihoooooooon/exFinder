package com.exfinder.service;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exfinder.dao.ExchangeRateDao;
import com.exfinder.dto.ExchangeRateDto;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {
	
	
	private ExchangeRateDao dao;
	
	@Autowired
	public ExchangeRateServiceImpl(SqlSession sqlSession) {
		this.dao = sqlSession.getMapper(ExchangeRateDao.class);
	}

	@Override
	public ArrayList<ExchangeRateDto> exchangeRateSelect(String c_code, String start_date, String end_date)
			throws Exception {
		return dao.exchangeRateSelect(c_code, start_date, end_date);
	}

	@Override
	public int exchangeRateInsert(ExchangeRateDto dto) throws Exception {
		return dao.exchangeRateInsert(dto);
	}
	
	public ArrayList<ExchangeRateDto> checkExchange(String curreny,String startDate,String endDate) {
		ArrayList<ExchangeRateDto> list = new ArrayList<ExchangeRateDto>();
		WebElement element = null;
		String[] sDate = startDate.split("-");
		String[] eDate = endDate.split("-");
		

		try {
			URL resource = getClass().getClassLoader().getResource("drivers/chromedriver.exe");
			String driverPath = Paths.get(resource.toURI()).toString();
			System.out.println("driverPath : " + driverPath);
			System.setProperty("webdriver.chrome.driver", driverPath);

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--disable-popup-blocking"); // 팝업안띄움
			options.addArguments("headless"); // 브라우저 안띄움
			options.addArguments("--disable-gpu"); // gpu 비활성화
			options.addArguments("--blink-settings=imagesEnabled=false"); // 이미지 다운 안받음
			
			WebDriver driver = new ChromeDriver(options);

			String baseUrl = "https://spot.wooribank.com/pot/Dream?withyou=FXXRT0014";
			driver.get(baseUrl);

			Thread.sleep(1000);
			
			//통화 선택
			Select selectCurr = new Select(driver.findElement(By.id("id01")));
			selectCurr.selectByValue(curreny);

			// 시작 년 선택
			Select start_Year = new Select(driver.findElement(By.id("START_DATEY")));
			
			start_Year.selectByValue(sDate[0]);
			
			// 시작 월 선택
			Select start_Month = new Select(driver.findElement(By.id("START_DATEM")));

			start_Month.selectByValue(sDate[1]);

			// 시작 일 선택
			Select start_Day = new Select(driver.findElement(By.id("START_DATED")));

			start_Day.selectByValue(sDate[2]);
			
			// 종료 년 선택
			Select end_Year = new Select(driver.findElement(By.id("END_DATEY")));
			
			end_Year.selectByValue(eDate[0]);
			
			// 종료 월 선택
			Select end_Month = new Select(driver.findElement(By.id("END_DATEM")));
			
			end_Month.selectByValue(eDate[1]);
			
			// 종료 일 선택
			Select end_Day = new Select(driver.findElement(By.id("END_DATED")));
			
			end_Day.selectByValue(eDate[2]);

			// 조회 버튼
			element = driver.findElement(By.xpath("//*[@id=\"frm\"]/fieldset/div/span/input"));
			element.click();

			// 해당 날짜로 조회 완료
			Thread.sleep(10000);

			WebElement table = driver.findElement(By.xpath("//*[@id=\"fxprint\"]/table"));
			WebElement tbody = table.findElement(By.tagName("tbody"));
			List<WebElement> trs = tbody.findElements(By.tagName("tr"));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			
			for(int i = trs.size()-1; i >=0; i--) {
				ExchangeRateDto dto = new ExchangeRateDto();
				String res_date = trs.get(i).findElements(By.tagName("td")).get(0).getText();
				dto.setRate_date(LocalDate.parse(res_date,formatter));
				
				String res_tts = trs.get(i).findElements(By.tagName("td")).get(1).getText().replaceAll(",", "");
				double tts = isValidDouble(res_tts) != -1 ? isValidDouble(res_tts) : 0; 
				dto.setTts(tts);
				
				String res_ttb = trs.get(i).findElements(By.tagName("td")).get(2).getText().replaceAll(",", "");
				double ttb = isValidDouble(res_ttb) != -1 ? isValidDouble(res_ttb) : 0; 
				dto.setTtb(ttb);
				
				String res_cashBuy = trs.get(i).findElements(By.tagName("td")).get(3).getText().replaceAll(",", "");
				double cashBuy = isValidDouble(res_cashBuy) != -1 ? isValidDouble(res_cashBuy) : 0; 
				dto.setCash_buy(cashBuy);
				
				String res_cashSell = trs.get(i).findElements(By.tagName("td")).get(4).getText().replaceAll(",", "");
				double cashSell = isValidDouble(res_cashSell) != -1 ? isValidDouble(res_cashSell) : 0;
				dto.setCash_sell(cashSell);
				
				String res_dealBS = stringCut(trs.get(i).findElements(By.tagName("td")).get(5).getText().replaceAll(",", ""));
				double dealBs = isValidDouble(res_dealBS) != -1 ? isValidDouble(res_dealBS) : 0;
				dto.setDeal_bas_r(dealBs);
				
				String res_baseR = trs.get(i).findElements(By.tagName("td")).get(6).getText().replaceAll(",", "");
				double baseR = isValidDouble(res_baseR) != -1 ? isValidDouble(res_baseR) : 0; 
				dto.setBase_r(baseR);
				
				dto.setC_code(curreny);
				list.add(dto);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(curreny + " 완료");
		return list;
	}
	
	public double isValidDouble(String str) {
	    try {
	        return Double.parseDouble(str);
	    } catch (NumberFormatException e) {
	        return -1;
	    }
	}
	
	 public static String stringCut(String input) {
	        String[] keywords = {"하락", "상승"};
	        for (String keyword : keywords) {
	            if (input.contains(keyword)) {
	                String[] parts = input.split(keyword, 2); // 두 번째 매개변수는 분할 수를 지정합니다.
	                return parts[0].trim(); // 첫 번째 부분(하락 또는 상승 앞)을 반환
	            }
	        }
	        return input.trim(); // 키워드가 없을 경우 전체 문자열 반환
	    }

	@Override
	public double exchangeRateSelect_base_r(String c_code, String rate_date) {
	    try {
	    	return dao.exchangeRateSelect_base_r(c_code, rate_date);
	    } catch (Exception e) {
	    	System.out.println("조회할수 있는 날짜 조차 없으니 0을 반환");
	        return 0;
	    }
	}

	@Override
	public String[] currSelect() throws Exception {
		return dao.currSelect();
	}

}
