import java.util.Scanner;
public class FuelCosts {
    //Write a program that asks the user to input (should all be type double)
    //The number of gallons of gas in the tank
    //The fuel efficiency in miles per gallon
    //The price of gas per gallon
    //Again use a do loop structure for each variable (3 here!)
    //Then print the cost per 100 miles and how far the car can go with the gas in the tank.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double cost;
        double drivingDistance;
        String badInput;
        boolean validInput = false;

        do {
            System.out.print("Please enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsOfGas = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else {
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid input.");
            }
        } while (!validInput);

        validInput = false;


        do {
            System.out.print("Please enter the miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else {
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid input.");
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.print("Please enter the price per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                validInput = true;
            }
            else {
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid input.");
            }
        } while (!validInput);

        cost = 100 / milesPerGallon * pricePerGallon;
        drivingDistance = milesPerGallon * gallonsOfGas;
        System.out.println("The cost per 100 miles is: " + cost);
        System.out.println("The car can go " + drivingDistance + " miles with the gas in the tank.");

    }
}
