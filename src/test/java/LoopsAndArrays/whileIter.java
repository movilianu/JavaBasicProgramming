package LoopsAndArrays;

public class whileIter {
    public static void main(String[] args) {
        boolean myFlag = false;
        int iter = 0;

        while (myFlag) {
            System.out.print(iter++);
            System.out.println("x");
            if (iter == 5) myFlag = false;
        }


//        int iterr = 0;
//        do {
//            System.out.print(iterr++);
//            System.out.println("x");
//        } while (myFlag);
    }
}
