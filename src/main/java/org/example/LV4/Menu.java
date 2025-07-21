package org.example.LV4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Menu {
    private String name;
    private List<MenuItem> menuItems;

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return Collections.unmodifiableList(menuItems); // 일기 전용으로 바꾼다고 한다.
    }

    public void displayMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i+1) + ". " + item.getName() + " | " + "W " + item.getPrice() + " | " + item.getInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}
