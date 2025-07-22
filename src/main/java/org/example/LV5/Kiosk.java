package org.example.LV5;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = Collections.unmodifiableList(menus); // 읽기 전용으로 바꾼다고 하는데...
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗");
            System.out.println("        ***   메인 메뉴  ***       ");
            System.out.println("  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println( (i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println("0. 종료");

            System.out.print("번호 입력: ");
            int mainChoice;

            try {
                mainChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
                continue;
            }

            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (mainChoice < 1 || mainChoice > menus.size()) {
                System.out.println("번호를 잘못 입력하셨습니다.");
                continue;
            }

            Menu selectedMenu = menus.get(mainChoice - 1);

            while(true){
                System.out.println("  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗");
                System.out.println("            " + selectedMenu.getName() + " MENU ");
                System.out.println("  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝");
                selectedMenu.displayMenuItems();

                System.out.print("번호 입력: ");
                int itemChoice;

                try {
                    itemChoice = scanner.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    scanner.nextLine();
                    continue;
                }

                if (itemChoice == 0) {
                    break;
                }
                List<MenuItem> items = selectedMenu.getMenuItems();
                if (itemChoice < 1 || itemChoice > items.size()) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                MenuItem selectedItem = items.get(itemChoice - 1);
                System.out.println("선택된 메뉴 : " + selectedItem.getName() + " | " + "W " + selectedItem.getPrice() + " | " + selectedItem.getInfo());

            }
        }
    }
}