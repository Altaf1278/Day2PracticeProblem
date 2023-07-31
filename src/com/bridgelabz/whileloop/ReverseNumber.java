package com.bridgelabz.whileloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNumber=0, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        while (number!=0){
            remainder= number%10;
            reverseNumber = reverseNumber*10 + remainder;
            number /= 10;
        }
        System.out.println("Following is the ReverseNumber: " + reverseNumber);
    }
}
