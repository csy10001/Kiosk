package org.example.LV4;
import java.util.List;
import java.util.Scanner;


class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println( (i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println("0. 종료      | 종료");

            System.out.print("번호 입력: ");
            int mainChoice = scanner.nextInt();

            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (mainChoice < 1 || mainChoice > menus.size()) {
                System.out.println("번호를 잘못 입력하셨습니다.");
                continue;
            }

            Menu selectedMenu = menus.get(mainChoice - 1);
            System.out.println("[ " + selectedMenu.getName() + " MENU ]");
            selectedMenu.displayMenuItems();

            System.out.print("번호 입력: ");
            int itemChoice = scanner.nextInt();

            if (itemChoice == 0) {
                continue;
            }

            List<MenuItem> items = selectedMenu.getMenuItems();
            if (itemChoice < 1 || itemChoice > items.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            MenuItem selectedItem = items.get(itemChoice - 1);
            System.out.printf("선택한 메뉴: %s | W %.1f | %s%n",
                    selectedItem.getName(), selectedItem.getPrice(), selectedItem.getInfo());
        }
    }
}
