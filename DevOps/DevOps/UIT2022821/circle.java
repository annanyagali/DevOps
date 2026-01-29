package DevOps.UIT2022821;

import java.util.Scanner; // Import the Scanner class

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the radius of the circle: ");
        // Read the radius from user input, using double to allow decimals
        double radius = scanner.nextDouble();

        // Calculate the area using the formula A = Math.PI * r * r
        double area = Math.PI * radius * radius;

        // Print the calculated area
        System.out.println("The area of the circle is: " + area);

        scanner.close(); // Close the scanner to free resources
    }
}


