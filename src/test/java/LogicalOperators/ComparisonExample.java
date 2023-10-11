package LogicalOperators;

public class ComparisonExample {

    public static void main(String[] args) {
        // Code snippet for equal to (==)
        int currentTemperature = 25;
        if (currentTemperature == 2) {
            System.out.println("The current temperature is 25 degrees Celsius.");
        }

        // Code snippet for not equal (!=)
        String enteredUsername = "john123";
        String existingUsername = "Adelina";
        if (!enteredUsername.equals(existingUsername)) {
            System.out.println("The username is available.");
        }
    }
}
