#Venumuni Chimmani

This repository contains solutions for 4 Java programs focusing on loops, conditions, mathematical operations, and basic logic building.

📘 Problem 1: Calculator using Class

Description

A simple calculator program that can perform:

Addition

Subtraction

Multiplication

Division

Inputs

a → first number (double)

b → second number (double)

operation → one of: +, -, *, /

Logic

Read two numbers and an operation

Check which operation is selected

Perform calculation

Handle division by zero

Print result

Code
import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter the first value:");
        double a = sc.nextDouble();

        System.out.println("Enter the second value:");
        double b = sc.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        String op = sc.next();
        double result;

        // Performing operations
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            // Division by zero check
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return;
            }
            result = a / b;
        } else {
            // Invalid operator case
            System.out.println("Invalid operation");
            return;
        }

        // Printing output
        System.out.println("The result of a and b is : " + result);
    }
}


📘 Problem 2: Odd Number Series
Description

This program prints the first n odd numbers.

Example

Input: 4
Output: 1, 3, 5, 7

Logic

The nth odd number is:
2 × n − 1

Loop from 1 to n and print each odd number

Code


import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many odd numbers you want:");
        
        int num = sc.nextInt();  // number of odd values to print

        // Loop to print first 'num' odd numbers
        for (int i = 1; i <= num; i++) {

            // Odd number formula
            System.out.print(2 * i - 1);

            // Print comma except after last number
            if (i < num) {
                System.out.print(", ");
            }
        }
    }
}




📘 Problem 3: Conditional Odd Number Series
Description

Print odd numbers based on the following condition:

If a is odd → print a odd numbers

If a is even → print a − 1 odd numbers

Examples

Input: 3 → 1, 3, 5
Input: 6 → 1, 3, 5, 7, 9

Logic

Use a condition to check even/odd

Set count = a or a - 1

Print odd numbers using formula: 2 × i − 1

Code


import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        
        int num = sc.nextInt();

        // If number is even → print (num - 1), else print num
        int count = (num % 2 == 0) ? (num - 1) : num;

        // Printing odd numbers
        for (int i = 1; i <= count; i++) {

            // Odd number formula
            System.out.print(2 * i - 1);

            // Comma formatting
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}




📘 Problem 4: Count Multiples (1–9)
Description

Given the array:

[1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]


Count how many numbers are divisible by each value from 1 to 9.

Expected Output
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

Logic

Loop from 1 to 9

For each value, count how many array elements are divisible by it

Print output in {key: value} format

Code

public class Problem_4 {

    public static void main(String[] args) {

        // Given array
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        System.out.print("{");

        // Loop numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            // Count how many elements divisible by i
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }

            // Print as key:value
            System.out.print(i + ": " + count);

            // Add comma except for last
            if (i < 9) {
                System.out.print(", ");
            }
        }

        System.out.print("}");
    }
}
