package LoopsAndArrays;

public class whileIter {
    public static void main(String[] args) {
        boolean myFlag = true;
        int iter = 0;

        while (myFlag) {
            System.out.print(iter++);
            System.out.println("x");
            if (iter == 5) myFlag = false;
        }
    }
}
