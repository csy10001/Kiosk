package org.example.LV3;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private final List<MenuItem> menuItems = new ArrayList<>();

    public void start(){
        menuItems.add(new MenuItem(1,"ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(2,"SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(3,"Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(4,"Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getNumber()+"."+ menuItem.getName() + " | " + " W " + menuItem.getPrice() + " | " + menuItem.getBugerInfo());
        }
        System.out.println( "0." + "종료" + " | " + "종료");

        int choice = 0;

        while (true) {
            System.out.print("원하시는 정보의 번호를 입력해주세요 : ");
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
            } else if (1 <= choice && choice <= menuItems.size()) {
                System.out.println(menuItems.get(choice-1));
            } else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
            }
        }
        scanner.close();
    }
}
