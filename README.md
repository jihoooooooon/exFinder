# ExFinder💹
<p align="center">
<img src="https://github.com/user-attachments/assets/0905e2e5-dbb2-4c16-9a04-70d8fe8e9ad3" width="400" height="150"/>
</p>
<h3 align="center"><strong>실시간 환율 정보와 환율 알림 서비스 제공</strong></h3>


- **프로젝트명** : ExFinder
- **프로젝트기간** : 24.08.21 ~ 24.10.16

<br/>

# 목차 📚
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%86%8C%EA%B0%9C-">프로젝트 소개</a>
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#%ED%8C%80%EC%9B%90%EC%86%8C%EA%B0%9C-%EB%B0%8F-%EC%97%AD%ED%95%A0-">팀원소개 및 역할
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#%EA%B8%B0%EC%88%A0-%EC%8A%A4%ED%83%9D-">기술 스택
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#erd-">ERD
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-">주요 기능
- <a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#%ED%9B%84%EA%B8%B0-">후기</a>

<br/>
<br/>

# 프로젝트 소개 🔎

- 실시간 환율 정보와 환율 알림 서비스를 제공하는 웹페이지💱
- 해외 여행 수요 증가와 환테크 유행이라는 사회적 이슈에서 고안된 웹 페이지 🌍
- 실시간 환율 정보와 직관적인 디자인으로 환율 변동 추이가 한눈에 확인 가능 👁️
- 웹소켓을 이용한 환율 알림 기능을 통해 원하는 금액에 알림을 받는 서비스 제공 🔔
  
  <br/>
  <br/>


# 팀원소개 및 역할 👨‍👨‍👦‍👦
| 이원빈 | 김정호 | 최현웅 | 함지훈 |
|:------:|:------:|:------:|:------:|
| <img src="https://github.com/user-attachments/assets/c1c2b1e3-656d-4712-98ab-a15e91efa2da" alt="이동규" width="150"> | <img src="https://github.com/user-attachments/assets/78ec4937-81bb-4637-975d-631eb3c4601e" alt="신유승" width="150"> | <img src="https://github.com/user-attachments/assets/78ce1062-80a0-4edb-bf6b-5efac9dd992e" alt="김나연" width="150"> | <img src="https://github.com/user-attachments/assets/beea8c64-19de-4d91-955f-ed24b813a638" alt="이승준" width="150"> |
| PL | FE | FE | FE |
| [@leewonbin](https://github.com/leewonbin) | [@zzz5678](https://github.com/zzx5678) | [@WoongE12](https://github.com/WoongE12) | [@jihoooooooon](https://github.com/jihoooooooon) |
| <ul align="left"><li>프로젝트 전체 관리</li><li>환율 정보 가져오기</li><li>환율 알림 기능</li><li>환율 계산기</li></ul> | <ul align="left"><li>로그인 및 찾기</li><li>차트</li><li>뉴스 크롤링</li><li>세계 지도</li></ul> | <ul align="left"><li>게시판</li><li>고객센터</li><li>환율 조회 테이블</li><li>오늘의 환율 추천</li></ul> | <ul align="left"><li>마이페이지</li><li>관리자 페이지</li><li>회원가입</li><li>계정관리</li><li>주변 환전 은행 찾기</li></ul> |

<br/>
<br/>

# 기술 스택 ⚙

## Frotend
![image](https://github.com/user-attachments/assets/59519084-0a14-45c5-8fb3-9219e600b6bf)

<br/>

## Backend
![image](https://github.com/user-attachments/assets/b5d04cd3-548f-4b6c-8443-ad512e63186c)

<br/>

## Tools, Cooperation
![image](https://github.com/user-attachments/assets/3c58014d-d840-4544-a698-91b05ca026fc)

<br/>

## Server
![image](https://github.com/user-attachments/assets/751b65cd-cdb2-4ab6-a3a7-b3b4627cd8eb)

<br/>

## DB
![image](https://github.com/user-attachments/assets/0cf6b563-bfd7-400f-969f-30c77731bb6d)

<br/>

## Skills or API
![image](https://github.com/user-attachments/assets/ba926848-da59-4b63-a4d3-54a3a458e0b6)


<br/><br/>

# ERD 📝
![image](https://github.com/user-attachments/assets/8181cd50-56da-4d94-baa9-6b02487818be)

<br/><br/>
# 주요 기능 💵
- **회원가입**
  - 회원가입 시 DB에 유저정보가 등록됩니다.<br/>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85">기능보기</a>

- **로그인**
  - ID / PW를 입력해 로그인을 합니다.
  - 아이디 저장, 자동 로그인 기능을 지원해 사용자 편의성을 높였습니다.
  - ID와 PW를 각각 회원가입 시 입력했던 이메일과 전화번호로 찾을 수 있습니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EB%A1%9C%EA%B7%B8%EC%9D%B8">기능보기</a>

- **커뮤니티**
  - 유저들 간 환율 동향에 대해 이야기를 나눌 수 있습니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EC%BB%A4%EB%AE%A4%EB%8B%88%ED%8B%B0">기능보기</a>

- **메인 페이지**
  - 환율 계산기 : 실시간 환율 정보를 적용해 환전 금액을 알 수 있습니다.
  - 시간별 변동 추이 차트 : 각 통화별 차트를 통해 변동 추이를 시각적으로 볼 수 있습니다.
  - 세계 환율 변동률 : 세계지도에 각 통화별 전일비와 값을 볼 수 있습니다.
  - 실시간 환율 표 : 실시간으로 환율 정보를 볼 수 있습니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EB%A9%94%EC%9D%B8%ED%8E%98%EC%9D%B4%EC%A7%80">기능보기</a>

- **상세 페이지**
  - 기간별 변동 추이 : 단위 기간별 차트를 통해 변동 추이를 시각적으로 볼 수 있습니다
  - 최신 뉴스 : 최신 뉴스를 통해 환율 동향에 대해 참고 할 수 있습니다.
  - 일자,시간별 테이블 :과거 환율 정보를 조회할 수 있습니다.
  - 즐겨찾기와 환율 알림 기능을 이용할 수 있습니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EC%83%81%EC%84%B8%ED%8E%98%EC%9D%B4%EC%A7%80">기능보기</a>
  

- **마이 페이지**
  - 내 프로필, 회원 정보 수정, 회원 탈퇴를 진행 할 수 있습니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80">기능보기</a>

- **관리자 페이지**
  - 회원관리, 계정권한 관리, 게시판 관리, 환율 업데이트 기능을 지원합니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EA%B4%80%EB%A6%AC%EC%9E%90%ED%8E%98%EC%9D%B4%EC%A7%80">기능보기</a>
    
- **실시간 환율 알림**
  - 사용자가 환율 알림을 설정하면 사용자가 설정한 목표치에 도달할 경우 웹 페이지 내 헤더와 회원정보에 등록된 전화번호로 SMS를 통해 사용자에게 알림을 줍니다.<br>
  <a href="https://github.com/leewonbin/exFinder/blob/master/Preview.md#%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C---%EC%8B%A4%EC%8B%9C%EA%B0%84-%ED%99%98%EC%9C%A8-%EC%95%8C%EB%A6%BC">기능보기</a>
    

<br/>
<br/>

# 후기 🧐
- 이원빈 : Java, Spring, HTML, CSS, JS, AJAX 등 웹 개발에 필요한 기술을 사용하면서 기술의 이해도를 높인 점이 좋았습니다. 특히 해당 웹페이지를 구현하면서 환율 공공데이터 API의 지원 통화의 한계점과 고시회차 정보를 지원하지 않아 어려움을 겪었지만 웹 크롤링과 스프링 스케줄러를 통해 API를 대체했던 점이 뿌듯하고 좋았습니다.<br/><br/>
- 김정호 : CRUD 작업, 구글 차트, 웹 크롤링, 네이버 POP3/SMTP, 쿨에스엠에스 API 등 다양한 기술을 활용해 여러 기능을 구현한 점이 매우 만족스러웠습니다.
수많은 시행착오를 겪었지만, 팀원들과 적극적으로 소통하며 문제를 빠르게 파악하고 해결한 경험이 큰 도움이 되었습니다. 또한, 모르는 부분이 있을 때 서로 질문하고 대화하면서 부족한 부분을 보완해 나간 점도 의미 있는 경험이었습니다. <br/><br/>
- 최현웅 : 실제 은행에서 사용하는 API를 활용하지 못해 데이터의 디테일이 부족했던 점이 아쉬웠습니다. 그럼에도 불구하고 웹사이트의 완성도가 떨어져 보일 수 있지만, 제한된 조건 속에서 대체할 수 있는 방법을 찾아가며 계획한 핵심 기능들이 잘 구현된 것에 만족합니다. 특히 CRUD 작업에 대한 이해도가 높아졌고, 웹 크롤링, API, 웹소켓 등 여러 기술을 활용해볼 수 있는 경험이 매우 유익했습니다. <br/><br/>
- 함지훈 : 관리자 권한에서 계정 및 게시물 삭제와 활성화 설정 기능을 추가해 효율적인 관리가 가능하게 했고, API를 활용해 외부 통신에 대한 개념을 확립한 점을 긍정적으로 평가했습니다. 하지만 마이페이지 디자인이 허전하게 느껴지고, 환율 관련 추가 관리자 기능이 부족한 점은 추후 개선할 예정입니다.

<br/><br/>
<a href="https://github.com/leewonbin/exFinder?tab=readme-ov-file#exfinder">맨위로</a>
