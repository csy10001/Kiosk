package org.example.LV1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hambergerMenu = {"0. 종료      | 종료",
                                  "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                                  "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                                  "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                                  "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
        };
        for (int i = 0; i < hambergerMenu.length; i++) {
            System.out.println(hambergerMenu[i]);
        }
        System.out.print("원하시는 정보의 번호를 입력해주세요 : ");
        int choice = 0;

        while (true) {
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print("다시 입력해주세요 : ");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (1 <= choice && choice < hambergerMenu.length) {
                System.out.println(hambergerMenu[choice]);
                System.out.print("다른 정보가 필요하시면 번호를 입력해주세요 : ");
            } else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                System.out.print("다시 입력해 주십시오 : ");
            }
        }
        scanner.close();

    }
}
