package LoopsAndArrays;

import java.util.ArrayList;

public class ForLoopExample {
    // Shopping Cart
    public static void main(String[] args) {
        ArrayList<String> cartItems = new ArrayList<>();
        cartItems.add("Item 1");
        cartItems.add("Item 2");
        cartItems.add("Item 3");
        cartItems.add("Item 4");
        cartItems.add("Item 5");

        System.out.println("Items in the shopping cart:");

        for (int i = 3; i < cartItems.size(); i--) {
            System.out.println("- " + cartItems.get(i));
        }
    }
}
