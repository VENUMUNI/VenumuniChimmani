Java Basic Programs – Venumuni Chimmani

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

