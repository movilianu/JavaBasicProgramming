package ConditionalStatements;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        // Assume dayOfWeek is an integer representing the day of the week (1-7)
        Scanner userInput = new Scanner(System.in);
        // Input password
        System.out.println("Zi-mi a cata planeta de la soare vrei sa afli cum se cheama: ");
        int planetName = userInput.nextInt();

        // Switch statement to determine the day of the week
        String dayName = switch (planetName) {
            case 1 -> "Mercur";
            case 2 -> "Venus";
            case 3 -> "Pamant";
            case 4 -> "Marte";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptun";
            case 9 -> "Pluto";
            default -> "Planeta selectata nu se afla in sistemul nostru solar.";
        };


        // Print the result
        System.out.println("Planeta este: " + dayName);
    }
}
