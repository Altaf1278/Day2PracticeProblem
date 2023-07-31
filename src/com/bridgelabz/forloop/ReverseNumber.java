package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNumber = 0, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int number = scanner.nextInt();

        for (int i = number; i>0; i=i/10){
             remainder = i%10;
             reverseNumber = reverseNumber*10 +remainder;

        }
        System.out.println("Following is the reverse number: " +reverseNumber);
    }
}
