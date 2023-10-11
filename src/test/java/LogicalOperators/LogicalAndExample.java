package LogicalOperators;

public class LogicalAndExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasQualifications = true;

        if (age >= 18 && hasQualifications) {
            System.out.println("Person is eligible for the job");
        } else {
            System.out.println("Person is not eligible for the job");
        }
    }
}
