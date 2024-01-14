// HelloWorld.java file
package my;

// import Apple class
import my.pack.Apple;

public class AppleUsage {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // we create apples - Apple class objects
        Apple marulMeu = new Apple();
        Apple marulVostru = new Apple(8, "green");
        Apple marulTrei = new Apple(2);
        Apple marulPatru = new Apple(5,"red");
        marulTrei.getColour();
        marulPatru.getColour(); // red
        marulMeu.getSize(); // 0
        System.out.printf("1st apple's size is %d and colour is %s.%n", marulMeu.getSize(), marulMeu.getColour());
        System.out.printf("2nd apple's size is %d and colour is %s.%n%n", marulVostru.getSize(), marulVostru.getColour());

        // we set the fields of the first apple
        marulMeu.setSize(13);
        marulMeu.setColour("red");
        System.out.printf("Now 1st apple's size is %d and colour is %s.%n%n", marulMeu.getSize(), marulMeu.getColour());

        // we call the rot() method on the first apple
        System.out.print(marulMeu.rot(3, "brown"));
        System.out.printf(" And its colour is %s.%n", marulMeu.getColour());
    }
}
