import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        //Write a program that has the computer generate a random int value between 1 to 10 inclusive.  The program then asks the user to guess the number with a single guess.  The program displays the random number and then indicates if the users guess was high low or on the money! Use the do while loop again to bulletproof the guess.

        Scanner in = new Scanner(System.in);
        Random randomInt = new Random();
        int val = randomInt.nextInt(10) + 1; // val is 1 to 10
        int userInput = 0;
        String badInput; // use for bad input which will read as a String
        boolean isValidInput = false;

        do {
            System.out.print("Guess an integer number: ");
            if (in.hasNextInt()) {
                userInput = in.nextInt();
                in.nextLine();
                isValidInput = true;
            }
            else {
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid integer!");
                System.out.println("You have to enter a valid integer!");
            }
        } while (!isValidInput);

        System.out.println("The winning number is " + val);
        if (userInput > val) {
            System.out.println("Your guess was high.");
        } else if (userInput < val) {
            System.out.println("Your guess was low.");
        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}