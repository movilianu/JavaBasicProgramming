package LoopsAndArrays;

import java.util.ArrayList;

/**
 *
 */
public class ForLoopExample {
    // Shopping Cart
    public static void main(String[] args) {
        ArrayList<String> lucruriDinCos = new ArrayList<>();
        lucruriDinCos.add("Banane");
        lucruriDinCos.add("Lapte");
        lucruriDinCos.add("Miere");
        lucruriDinCos.add("Carnati");
        lucruriDinCos.add("Prune");

        System.out.println(lucruriDinCos);

        System.out.println("Items in the shopping cart:");

//        for (int i = 0; i < lucruriDinCos.size(); i++) {
//            System.out.println("- " + lucruriDinCos.get(i));
//        }

//        for (int i = lucruriDinCos.size() - 1; i >= 0; i--) {
//            System.out.println("- " + lucruriDinCos.get(i));
//        }

        for (int i = 4; i < lucruriDinCos.size(); i--) {
            try {
                System.out.println("- " + lucruriDinCos.get(i));
            } catch (IndexOutOfBoundsException eroareNume) {
                // Handle the exception here or simply ignore it.
                // You can add a message or any custom handling if needed.
                System.out.println("Index out of bounds: " + eroareNume.getMessage());
                break;
            }
        }

        // Definim o listă de produse
        String[] produse = {"Produs1", "Produs2", "Produs3", "Produs4", "Produs5", "Produs6"};

        // Folosim un buclu for pentru a parcurge lista de produse
        for (int i = 0; i < produse.length; i++) {
            // Verificăm dacă i este 2 și dacă da, folosim continue pentru a trece la următoarea iterație
            if (i == 2) {
                System.out.println("Skipping product at index " + i);
                continue;
            }

            // Verificăm dacă i este 4 și dacă da, folosim break pentru a ieși din buclu
            if (i == 4) {
                System.out.println("Breaking at index " + i);
                break;
            }

            // Afisăm produsul curent
            System.out.println("Produsul la indexul " + i + ": " + produse[i]);
        }
    }
}

