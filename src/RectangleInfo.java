import java.util.Scanner;
import java.lang.Math;
//
public class RectangleInfo {
    public static void main(String[] args) {
        //Write a program that asks the user for the lengths of the sides of a rectangle. Again, loop the input until it is valid.  (Note only two measure here, the Width and the Height…)
        //Testing: use some simple values to confirm that the calculations are correct. Then print:
        //The area and perimeter of the rectangle
        //The length of the diagonal (use the Pythagorean theorem)
        //Note: a 3 by 4 rectangle will have diagonal of 5

        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double area;
        double perimeter;
        double diagonal;
        String badInput; // use for bad input which will read as a String
        boolean isValidInput = false;

        do {
            System.out.print("Enter the width of a rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                isValidInput = true; // because we got a valid number we can end the loop
            }
            else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid number!");
                System.out.println("You have to enter a valid number!");
            }
        } while (!isValidInput);

        isValidInput = false; // Set flag back to false for next input validation

        do {
            System.out.print("Enter the length: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                isValidInput = true;
            }
            else {
                badInput = in.nextLine();
                System.out.println(badInput + " is not a valid number!");
                System.out.println("You have to enter a valid number!");
            }
        } while (!isValidInput);

        area = width * length;
        System.out.println("The area of the rectangle is " + area);
        perimeter = (width + length) * 2;
        System.out.println("The perimeter of the rectangle is " + perimeter);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}