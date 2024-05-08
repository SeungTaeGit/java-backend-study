# Basic product CRUD project
> CRUD 기초 학습 프로젝트

Spring CRUD 기능 개발을 위한 초석 프로젝트입니다.
Back-end API만 개발.
<br>

#### 개발 기간
2024.04 - 2024.05
<br>


### 사용 설명서
---
  #### 사용자 타입
  `사용자(Guest)`
  #### 서비스 이용 흐름
  `HOME` -> `상품 리스트 확인(+기능)` -> `상품 추가` -> `상품 수정` -> `상품 삭제`
  #### 페이지
  `메인(HOME)`, `포트폴리오 열람 사이트`, `관리자 페이지(포트폴리오 포스팅)`, `Contact 페이지`
  #### 기능
  **회원** : `열람` <br>
  **관리자** : `로그`, `사이트 관리` <br>
  #### 참고 자료
<br>


### 클래스 구조
---
#### Java Class
- repository
  - MemberRepository
    > 회원 데이터 저장
    - save
    - update
    - findById
    - findAll
      
- service
  - LoginService
    > 로그인 관련 로직
    - login
- controller
  - LoginController
  - BasicController
- ManagerData
  - ManageData
- **Main Thread**
<br>

#### Template
- static
  - index.html
- template
  - portfolio.html
  - contact.html
  - login.html
  - management.html  // 포트폴리오 포스팅 html
<br>
