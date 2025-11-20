import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        double a = sc.nextDouble();
        System.out.println("Enter the second value:");
        double b = sc.nextDouble();
        System.out.println("Enter the operations ");
        String op = sc.next();

        double result = 0;

        if (op.equals("+") || op.equalsIgnoreCase("add")) {
            result = a + b;
        } else if (op.equals("-") || op.equalsIgnoreCase("sub")) {
            result = a - b;
        } else if (op.equals("*") || op.equalsIgnoreCase("mul")) {
            result = a * b;
        } else if (op.equals("/") || op.equalsIgnoreCase("div")) {
            if (b == 0) {
                System.out.println("Division by zero not allowed");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("The result of a and b is : " + result);
    }
}
