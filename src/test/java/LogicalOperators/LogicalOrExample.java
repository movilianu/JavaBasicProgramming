package LogicalOperators;

public class LogicalOrExample {
    public static void main(String[] args) {
        boolean isOnSale = true;
        boolean isInStock = false;

        if (isOnSale || isInStock) {
            System.out.println("Product is available for purchase");
        } else {
            System.out.println("Product is currently unavailable");
        }
    }
}
