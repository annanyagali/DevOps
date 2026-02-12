package DevOps.UIT2022820;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        rectanglefeature rf = new rectanglefeature();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        try {
            double area = rf.calculateArea(length, breadth);
            System.out.printf("Area of Rectangle = %.2f\n", area);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input! " + e.getMessage());
        }

        sc.close();
    }
}
