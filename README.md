Problem 1: Calculator using Class
Description

A simple calculator program that performs the following operations:

Addition

Subtraction

Multiplication

Division

Inputs

a → double

b → double

operation → one of (+, -, *, /)

Logic

Read two numbers and an operator

Use if–else to identify the operation

Perform calculation

Handle division by zero

Print result

Code
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
        double result;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
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

Problem 2: Odd Number Series
Description

This program prints the first n odd numbers.

Example

Input: 4
Output: 1, 3, 5, 7

Logic

The formula for the nth odd number is:
2 × n − 1

Loop from 1 to n and generate odd numbers

Code
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print((2 * i - 1));
            if (i < num) System.out.print(", ");
        }
    }
}

Problem 3: Conditional Odd Number Series
Description

This program prints odd numbers based on the input number:

If the number is odd → print that many odd numbers

If the number is even → print (a − 1) odd numbers

Examples

Input: 3 → 1, 3, 5
Input: 6 → 1, 3, 5, 7, 9

Logic

Check if number is even or odd

Set count = number (if odd) or number − 1 (if even)

Print odd numbers using formula: 2 × i − 1

Code
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int count = (num % 2 == 0) ? (num - 1) : num;

        for (int i = 1; i <= count; i++) {
            System.out.print(2 * i - 1);
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}

Problem 4: Count Multiples (1–9)
Description

Given the array:

[1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]


Count how many elements are divisible by each number from 1 to 9.

Expected Output
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

Logic

Loop from 1 to 9

For each number, check how many array elements are divisible by it

Print output in dictionary format

Code
public class Problem_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        System.out.print("{");

        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }

            System.out.print(i + ": " + count);
            if (i < 9) System.out.print(", ");
        }

        System.out.print("}");
    }
}
