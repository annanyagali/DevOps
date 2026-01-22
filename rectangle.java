import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Invalid input! Length and breadth must be greater than zero.");
        } else {
            double area = length * breadth;
            System.out.printf("Area of Rectangle = %.2f\n", area);
        }

        sc.close();
    }
}
