package com.bridgelabz.operator;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        System.out.println("Answer of question 1 :" + result1);
        System.out.println("Answer of question 2 :" + result2);
        System.out.println(" Answer of question 3 :" + result3);
        System.out.println(" Answer of question 4 :" + result4);
    }
}
