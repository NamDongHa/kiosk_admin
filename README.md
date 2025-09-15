# ☕ BEANS COFFEE KIOSK – Admin 시스템

<p align="center">
  <img src="https://img.shields.io/badge/Backend-Java%20%7C%20Spring%20Boot-blue?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Frontend-Thymeleaf%20%7C%20Bootstrap-lightgrey?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Database-MariaDB-blue?style=for-the-badge&logo=mariadb" />
  <img src="https://img.shields.io/badge/Tools-Git%20%7C%20GitHub%20%7C%20Swagger%20%7C%20Notion-lightgrey?style=for-the-badge" />
</p>

BEANS COFFEE KIOSK의 **관리자(Admin) 시스템**은 매장 운영을 위한 **메뉴 관리, 주문 내역 확인, 매출 통계, 재고 관리, 유저 포인트 관리** 기능을 제공하는 Spring Boot + Thymeleaf 기반 웹 애플리케이션입니다.

---

## 📌 프로젝트 개요
- **프로젝트명:** BEANS COFFEE KIOSK – Admin 시스템  
- **개발 기간:** 2025.07.25 ~ 2025.08.02 (총 9일)  
- **개발 목적:** 키오스크 주문 시스템과 연동되는 관리자 기능 구현  
- **개발자:**  
  - 박성원 (Seongwon Park) – Admin 프론트엔드 & 백엔드 개발  
  - 남동하 (Nam Dong Ha) – Admin 프론트엔드 & 백엔드 개발  

---

## 🧑‍💻 주요 기능

### 🍽️ 메뉴 관리
- 메뉴 등록/수정/삭제  
- 카테고리별 메뉴 관리  
- 옵션 및 가격 설정  
- 신메뉴 자동 분류 (30일 이내 등록 기준)

### 📋 주문 내역 확인
- 일자별 주문 목록 조회  
- 주문 상세 정보 확인  
- 결제 상태 및 주문 시간 표시

### 📊 매출 통계 대시보드
- 일/주/월 단위 매출 집계  
- 인기 메뉴 분석  
- 주문 수량 기반 그래프 시각화

### 📦 재고 관리
- 메뉴별 재고 설정  
- 재고 부족 시 주문 제한 기능  

### 💰 유저 포인트 관리
- 유저 포인트 조회  
- 포인트 적립/사용 처리  
- 포인트 적립/사용 내역 조회  
- 사용자별 포인트 현황 관리 및 확인 기능 제공  

---

## 🛠️ 기술 스택
| 구분 | 기술 / 도구 |
|------|------------|
| Backend | Java, Spring Boot, MyBatis |
| Frontend | Thymeleaf, HTML, CSS, Bootstrap |
| Database | MariaDB |
| ORM / SQL 매핑 | MyBatis |
| Template | Thymeleaf |
| Tools & Platform | Git, GitHub, Swagger, Notion |

---

## 📂 프로젝트 구조
kiosk_admin/
├── controller/    # 요청 처리 및 화면 연결 (Spring MVC)
├── service/       # 비즈니스 로직 처리
├── mapper/        # MyBatis SQL 매핑 인터페이스
├── xml/           # SQL 쿼리 정의 XML 파일
├── model/         # DTO 및 VO 클래스
├── templates/     # Thymeleaf 템플릿 (HTML)
├── static/        # CSS, JS, 이미지 등 정적 파일
└── application.yml # 환경 설정

---

## 💭 회고
- Spring Boot 기반 **전통적인 MVC 구조** 설계  
- ORM 대신 **MyBatis**로 SQL 쿼리 직접 정의 및 매핑  
- **Thymeleaf + Bootstrap**으로 반응형 서버사이드 렌더링 UI 구성  
- 신메뉴 자동 분류, 재고 기반 주문 제한, 기간별 매출 통계 등 **운영 중심 기능 구현**  
- **유저 포인트 관리 기능** 추가로 고객 관리 및 마케팅 연계 경험  
- SQL 최적화 및 매핑 오류 처리 경험으로 **MyBatis 장단점 이해**  
- 실서비스 수준 **관리자 시스템 설계 및 구현 경험** 습득  

---

## 🔗 하위 프로젝트 링크
- [Cafe Kiosk – User](https://github.com/NamDongHa/kiosk_user)  
- [Cafe Kiosk – React](https://github.com/NamDongHa/kiosk_user_react)
