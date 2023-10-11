package LogicalOperators;

public class LogicalNotExample {
    public static void main(String[] args) {
        boolean isLoggedIn = true;

        if (!isLoggedIn) {
            System.out.println("Access denied. Please log in to continue.");
        } else {
            System.out.println("Welcome! Access granted.");
        }
    }
}
