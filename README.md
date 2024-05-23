# Basic product CRUD project
> CRUD, MySQL 기초 학습 프로젝트

- Spring CRUD 기능 개발을 위한 초석 개인 프로젝트입니다.
- Back-end API 개발 및 `JDBC Template`을 이용한 `MySQL`과의 연동.
- `Dto`와 `Entity`의 분리 개발 및 학습, 유효성 검사 개발.
- 기본적인 상품 `CRUD` 기능을 주요 기능으로 보유하고 있습니다.


#### 개발 기간
2024.04 - 2024.05
<br>
<br>


### Stacks
---
**Evironment** <br>
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&amp;logo=IntelliJ%20IDEA&amp;logoColor=white" alt="IntelliJ_IDEA">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">   <!-- Git -->
<img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=GitHub&logoColor=white">   <!-- Github -->

**Development** <br>
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">   <!-- Java -->
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">  <!-- Spring -->
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">  <!-- Spring boot -->
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">   <!-- MySQL -->
<br>
<br>


### 사용 설명서
---
  #### 사용자 타입
  `사용자(Guest)`
  #### 서비스 이용 흐름
  `HOME` -> `상품 리스트 확인(+기능)` -> `상품 추가` -> `상품 수정` -> `상품 삭제`
  #### 기능
  **사용자** : `상품 CREATE`, `상품 READ`, `상품 UPDATE`, `상품 DELETE` <br>
  #### 참고 자료
<br>
<br>


### 디렉토리 구조
---
```bash
├─.gradle
│  ├─8.7
│  │  ├─checksums
│  │  ├─dependencies-accessors
│  │  ├─executionHistory
│  │  ├─expanded
│  │  ├─fileChanges
│  │  ├─fileHashes
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  └─vcs-1
├─.idea
├─build
│  ├─classes
│  │  └─java
│  │      └─main
│  │          └─seungtae
│  │              └─product
│  │                  └─management
│  │                      ├─controller
│  │                      ├─dto
│  │                      ├─entity
│  │                      ├─exception
│  │                      ├─repository
│  │                      └─service
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  └─main
│  │      ├─static
│  │      └─templates
│  └─tmp
│      └─compileJava
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
├─gradle
│  └─wrapper
└─src
    ├─main
    │  ├─java
    │  │  └─seungtae
    │  │      └─product
    │  │          └─management
    │  │              ├─controller
    │  │                  └─ProductController
    │  │              ├─dto
    │  │                  └─ProductDto
    │  │              ├─entity
    │  │                  └─Product
    │  │              ├─exception
    │  │                  ├─EntityNotFoundException
    │  │                  ├─ErrorMessage
    │  │                  └─ClobalExceptionHandler
    │  │              ├─repository
    │  │                  ├─DatabaseProductRepository
    │  │                  └─ListProductRepository
    │  │              ├─service
    │  │                  ├─ProductService
    │  │                  └─ValidationService
    │  │              └─Application        // Main Thread
    │  └─resources
    │      ├─static
    │      └─templates
    └─test
        └─java
            └─seungtae
                └─product
                    └─management
```
<br>
