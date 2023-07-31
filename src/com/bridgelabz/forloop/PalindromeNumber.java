package com.bridgelabz.forloop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int reverseNumber = 0;
        int x = number;
        for (int i =x; x > 0; x /= 10) {
            int remainder = x % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }

        if (number == reverseNumber) {
            System.out.println("It is a palindrome number: " + number);
        } else {
            System.out.println("It is not a palindrome number: " + number);
        }
    }
}
