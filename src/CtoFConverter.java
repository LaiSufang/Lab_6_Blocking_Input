import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        //A program that converts an inputted temperature in C and provides the equivalent temperature in F.

        Scanner scanner = new Scanner(System.in);
        double tempF;
        double userInput;
        boolean validInput = false;

        do {
            System.out.println("Enter a temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid temperature in Celsius: ");
                scanner.next();
            }
            userInput = scanner.nextDouble();
        }
        while (false);

        tempF = (userInput * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}