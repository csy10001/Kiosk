package org.example.LV4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 메뉴 카테고리 생성
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("콜라", 1.5, "톡 쏘고 달달구리한 검은 물"));
        drinks.addMenuItem(new MenuItem("스프라이트", 2.0, "엄청 시원하면 콜라보다 맛있다고 생각함 "));

        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("요아정", 3.5, "요아정 너무 비싸 ㅡㅡ;;"));

        List<Menu> allMenus = new ArrayList<>();
        allMenus.add(burgers);
        allMenus.add(drinks);
        allMenus.add(desserts);

        Kiosk kiosk = new Kiosk(allMenus);
        kiosk.start();
    }
}
