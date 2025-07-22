package org.example.LV5;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<MenuItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }
    public void addItem(MenuItem item) {
        cartItems.add(item);
    }
    public void clearCart() {
        cartItems.clear();
        System.out.println("장바구니를 모두 비웠습니다.");
        return;
    }
    public void showCartItems() {
        System.out.println("[ 장바구니 ]");
        if (cartItems.isEmpty()) {
            System.out.println("장바구니가 비었습니다.");
            return;
        }
        double totalPrice = 0;
        for (int i =0; i < cartItems.size(); i++) {
            MenuItem item = cartItems.get(i);
            System.out.println((i+1) + ". " + item.getName() + " | " + "W " + item.getPrice() + " | " + item.getInfo());
            totalPrice += item.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.println(totalPrice+ "W "+"입니다.");

    }
}
