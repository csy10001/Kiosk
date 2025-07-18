package org.example.LV4;
import java.util.ArrayList;
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
        return menuItems;
    }

    public void displayMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s%n", i + 1, item.getName(), item.getPrice(), item.getInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}
