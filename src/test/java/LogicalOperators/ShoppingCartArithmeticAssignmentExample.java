package LogicalOperators;

public class ShoppingCartArithmeticAssignmentExample {
    private int itemCount;
    private double totalPrice;

    public ShoppingCartArithmeticAssignmentExample() {
        itemCount = 0;
        totalPrice = 0.0;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    public void removeItem(double price) {
        if (itemCount > 0) {
            itemCount--;
            totalPrice -= price;
        }
    }

    public void increaseQuantity(int quantity, double price) {
        itemCount += quantity;
        itemCount = itemCount + quantity;
        totalPrice += (quantity * price);
        totalPrice = totalPrice + (quantity * price);
    }

    public void decreaseQuantity(int quantity, double price) {
        if (itemCount >= quantity) {
            itemCount -= quantity;
            totalPrice -= (quantity * price);
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void main(String[] args) {
        ShoppingCartArithmeticAssignmentExample cart = new ShoppingCartArithmeticAssignmentExample();
        // Add items
        cart.addItem(10.99);
        cart.addItem(5.99);

        // Remove an item
        cart.removeItem(5.99);

        // Increase quantity
        cart.increaseQuantity(3, 7.99);

        // Decrease quantity
        cart.decreaseQuantity(1, 7.99);

        // Display item count and total price
        System.out.println("Item Count: " + cart.getItemCount());
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}
