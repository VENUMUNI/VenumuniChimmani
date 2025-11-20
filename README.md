# VenumuniChimmani

This repository contains solutions for **4 Java programs** covering basic logic building, loops, conditions, and mathematical operations.



#  **Problem 1: Calculator using Class**

### **Description**
A simple calculator that performs:
- Addition  
- Subtraction  
- Multiplication  
- Division  

**Inputs**
- `a` → double  
- `b` → double  
- `operation` → string (`+`, `-`, `*`, `/`)

### **Logic**
- Read `a`, `b`, and operator  
- Perform operation using if–else conditions  
- Print result  

### **Code**
```java
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

# Problem-2: Odd Number Series
# Description
Generate odd numbers up to a terms.
Example:
Input: 4
Output: 1, 3, 5, 7
Logic
The nth odd number = 2*n - 1.
// Print first 'a' odd numbers

import java.util.Scanner;
public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // number of odd values to print
        System.out.println("Enter the number:");
        for (int i = 1; i <= num; i++) {
            // formula for odd number
            System.out.print((2 * i - 1));
            if (i < num) System.out.print(", ");
        }
    }
}

# Problem-3: Conditional Odd Number Series
# Description:
Rules:
If a is odd → print a odd numbers
If a is even → print (a - 1) odd numbers
Examples
Input: 3 → 1, 3, 5
Input: 6 → 1, 3, 5, 7, 9

// Conditional odd number series
import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        // If a is even, print (a-1) odd numbers; if odd print a
        int count = (num % 2 == 0) ? (num - 1) : num;
        for (int i = 1; i <= count; i++) {
            System.out.print(2 * i - 1);
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}

# Problem-4: Count Multiples (1–9)
# Description
Given a list:
[1,2,8,9,12,46,76,82,15,20,30]
Count how many times each number from 1 to 9 divides elements.

Expected Output Format:
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
// Count multiples of 1 to 9

public class Problem_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        System.out.print("{");
        // Loop from 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            // Count how many numbers are divisible by i
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }
            // print result as "i: count"
            System.out.print(i + ": " + count);

            if (i < 9) System.out.print(", ");
        }
        System.out.print("}");
    }
}


