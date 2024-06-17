import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        //A program that converts an inputted temperature in C and provides the equivalent temperature in F.

        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF;
        String badInput;
        boolean validInput = false;

        do {
            System.out.println("Please enter a temperature in Celsius: ");
            if (in.hasNextDouble()) { //checks if the input is a double
                tempC = in.nextDouble(); //stores the input in tempC
                in.nextLine(); //clears the buffer
                validInput = true; //exits the loop
            }
            else {
                badInput = in.nextLine(); //stores the invalid input
                System.out.println(badInput + " is not a valid temperature input.");
            }
        } while (!validInput);

        tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}