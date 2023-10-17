package LoopsAndArrays;

import java.util.ArrayList;

/**
 *
 * */
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

//        for (int i = 2; i < cartItems.size(); i--) {
//            System.out.println("- " + cartItems.get(i));
//        }

//        for (int i = cartItems.size() - 1; i >= 0; i--) {
//            System.out.println("- " + cartItems.get(i));
//        }

        for (int i = 2; i < cartItems.size(); i--) {
            try {
                System.out.println("- " + cartItems.get(i));
            } catch (IndexOutOfBoundsException e) {
                // Handle the exception here or simply ignore it.
                // You can add a message or any custom handling if needed.
                System.out.println("Index out of bounds: " + e.getMessage());
                break;
            }
        }
    }
}
