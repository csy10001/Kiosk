package org.example.LV2;

public class MenuItem {
    private int number;
    private String name;
    private double price;
    private String bugerInfo;

    public MenuItem(int number, String name, double price, String bugerInfo) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.bugerInfo = bugerInfo;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {

        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getBugerInfo() {

        return bugerInfo;
    }
    public String toString() {
        return number + ". " + name + " | " + "W " + price + " | " + bugerInfo;
    }
}
