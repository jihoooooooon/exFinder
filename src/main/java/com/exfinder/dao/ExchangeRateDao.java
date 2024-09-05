package com.exfinder.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.exfinder.dto.ExchangeRateDto;

public interface ExchangeRateDao {
	public ArrayList<ExchangeRateDto> exchangeRateSelect(@Param("c_code")String c_code,@Param("start_date")String start_date,@Param("end_date")String end_date) throws Exception;
	public int exchangeRateInsert(ExchangeRateDto dto) throws Exception;
	
	public double exchangeRateSelect_base_r(@Param("c_code")String c_code, @Param("rate_date")String rate_date);
}
