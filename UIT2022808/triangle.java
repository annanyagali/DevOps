package UIT2022808;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Invalid input! Base and height must be greater than zero.");
        } else {
            double area = 0.5 * base * height;
            System.out.printf("Area of Triangle = %.2f\n", area);
        }

        sc.close();
    }
}