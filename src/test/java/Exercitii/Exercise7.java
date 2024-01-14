package Exercitii;

// Write a program, which reads user input, but first print "What's your name?" on standard output.
// Name should be displayed on screen. If name equals "John Wick", then print "I see you working again John",
// otherwise print "Welcome, [xyz]", where [xyz] display the value provided by user

import java.util.Scanner;

public class Exercise7 {

    public static void main(String []args) {
        Scanner userInput = new Scanner(System.in);

        // Input string
        System.out.println("What's your name?");
        String name = userInput.nextLine();

        // Print variable on standard output
        System.out.println("Provided name " + name);

        // Check who are you
        if (name.equals("John Wick")) {
            System.out.println("I see you working again John");
        } else if(name.equals("Johnny Depp")){
            System.out.println("Ahoy captain!");
        }
        else {
            System.out.println("Not those guys.");
        }

//        String myVar = new String("2024-01-13-Movilianu-Dan-xc3op3ufb4i3vyb4ibv43u");
//        myVar.contains("2024");
//        String anFactura = myVar.substring(0, 4); // Wha
//        String anCurent = "2024";
//        if (anFactura.equals(anCurent)){
//            System.out.println("Anul facturii este anul curent.");
//        } else {
//            System.out.println("Anul nu coincide! Eroare an factura.");
//        };
    }
}