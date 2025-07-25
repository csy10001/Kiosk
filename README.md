# 키오스크

Java 콘솔 환경에서 동작하는 키오스크 프로그램입니다.  
사용자는 메뉴를 선택하고 장바구니에 담은 후 결제를 진행할 수 있습니다.

---

## 프로젝트 소개

- **프로젝트명**: 간단한 자바 콘솔 키오스크
- **진행 기간**: 2025.07.15 ~ 2025.07.24
- **주요 기능**: 메뉴 선택, 장바구니 추가/삭제, 결제, 예외처리 등
- **개발 환경**: Java 17, IntelliJ IDEA

---

## 주요 기능

- 🔹 메인 메뉴, 서브 메뉴 구조
- 🔹 메뉴 선택 시 상세 정보 출력
- 🔹 장바구니에 메뉴 추가 및 전체 삭제 가능
- 🔹 숫자 외 입력 예외 처리
- 🔹 캡슐화 및 클래스 분리 설계

---

## 클래스 구성

| 클래스 | 설명 |
|--------|------|
| `Menu` | 메뉴 이름, 메뉴 아이템 리스트 관리 |
| `MenuItem` | 개별 메뉴 아이템 (이름, 가격, 설명) |
| `Kiosk` | 전체 흐름 제어 및 사용자 입력 처리 |
| `Cart` | 장바구니 기능 관리 (추가, 삭제, 비우기) |

---

## 실행 화면 예시

```
  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗
        ***   메인 메뉴  ***       
  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝
1. 햄버거
2. 사이드
3. 음료
0. 종료 | 종료
-----------------------
*  pay     | 장바구니를 확인 후 주문합니다.
*  cancel  | 진행중인 주문을 취소합니다.
입력: 1

  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗
            Burgers MENU 
  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝
1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
번호 입력: 3

선택된 메뉴 : Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
위 메뉴를 장바구니에 추가하시겠습니까?
1. 확인      2. 취소
입력: 1
장바구니에 추가되었습니다.

*  pay     | 장바구니를 확인 후 주문합니다.
*  cancel  | 진행중인 주문을 취소합니다.
입력 : pay

아래와 같이 주문하시겠습니까?
[ 장바구니 ]
1. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
[ Total ]
6.9W 입니다.
1. 주문      2. 메뉴판
입력 : 1
주문이 완료되었습니다.
```

---

## 만든 사람

| 이름 | GitHub | Blog |
|------|--------|------|
| 수영 | [github.com/csy10001](https://github.com/csy10001) |

---

## 폴더 구조

```
/src
  ├── Main.java
  ├── Kiosk.java
  ├── Menu.java
  ├── MenuItem.java
  └── Cart.java
```

---
## 트러블슈팅
```
 https://www.notion.so/232111a8b5fe80019ecac45dde00b46e 
```

