package ConditionalStatements;

public class SwitchBlockExample {
    public static void main(String[] args) {
        int a = 1;
        {
            a = 10;
            int b = 20;
            if (a == 10) {
                a = 100;
                b = 200;
                int c = 300;
            }
            System.out.println(a); // Output: 100
            System.out.println(b); // Output: 200
            // System.out.println(c); // Compilation error; variable c is out of scope
        }
    }
}
