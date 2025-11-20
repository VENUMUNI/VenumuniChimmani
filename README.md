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
