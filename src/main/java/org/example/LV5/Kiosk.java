package org.example.LV5;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;
    private Cart cart;

    public Kiosk(List<Menu> menus) {
        this.menus = Collections.unmodifiableList(menus);
        this.cart = new Cart();     // 읽기 전용으로 설정한다고 하네요...
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗");
            System.out.println("        ***   메인 메뉴  ***       ");
            System.out.println("  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝");

            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }

            System.out.println("0. 종료");
            System.out.println("-----------------------");
            System.out.println("*  pay     | 장바구니를 확인 후 주문합니다.");
            System.out.println("*  cancel  | 진행중인 주문을 취소합니다.");
            System.out.print("입력 : ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("cancel")) {
                cart.clearCart();
                continue;
            }

            if (input.equalsIgnoreCase("pay")) {
                while (true) {
                    System.out.println("아래와 같이 주문하시겠습니까?");
                    cart.showCartItems();
                    System.out.println("1. 주문      2. 메뉴판");
                    System.out.print("입력 : ");

                    String payInput = scanner.nextLine();
                    int payChoice;

                    try {
                        payChoice = Integer.parseInt(payInput);
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 입력입니다. 숫자 1 또는 2를 입력해주세요.");
                        continue;
                    }

                    if (payChoice == 1) {
                        System.out.println("주문이 완료되었습니다.");
                        cart.clearCart();
                        break;
                    } else if (payChoice == 2) {
                        System.out.println("메뉴판으로 돌아갑니다.");
                        break;
                    } else {
                        System.out.println("잘못된 선택입니다. 1 또는 2를 입력해주세요.");
                    }
                }
                continue;
            }

            int mainChoice;
            try {
                mainChoice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
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

            while (true) {
                System.out.println("  ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗");
                System.out.println("            " + selectedMenu.getName() + " MENU ");
                System.out.println("  ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝");

                selectedMenu.displayMenuItems();
                System.out.print("번호 입력: ");

                String itemInput = scanner.nextLine();
                int itemChoice;

                try {
                    itemChoice = Integer.parseInt(itemInput);
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }

                if (itemChoice == 0) {
                    break;
                }

                List<MenuItem> items = selectedMenu.getMenuItems();
                if (itemChoice < 1 || itemChoice > items.size()) {
                    System.out.println("잘못된 입력입니다. 유효한 번호를 선택해주세요.");
                    continue;
                }

                MenuItem selectedItem = items.get(itemChoice - 1);
                System.out.println("선택된 메뉴 : " + selectedItem.getName() + " | " + "W " + selectedItem.getPrice() + " | " + selectedItem.getInfo());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인      2. 취소");

                while (true) {
                    System.out.print("입력: ");
                    String cartInput = scanner.nextLine();
                    int cartChoice;

                    try {
                        cartChoice = Integer.parseInt(cartInput);
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        continue;
                    }

                    if (cartChoice == 1) {
                        System.out.println("장바구니에 추가되었습니다.");
                        cart.addItem(selectedItem);
                        break;
                    } else if (cartChoice == 2) {
                        System.out.println("취소되었습니다.");
                        break;
                    } else {
                        System.out.println("1 또는 2를 입력해주세요.");
                    }
                }
            }
        }

        scanner.close();
    }
}
