package com.bridgelabz.ifelse;

import java.util.Scanner;

public class PrintUnitTensHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in tens hundred and thousand: ");
        int number = scanner.nextInt();
        if (number == 1) {
            int unit = number % 10;
            System.out.println("Unit" + unit);
        } else if (number == 10) {
            int ten = ((number / 10) % 10) * 10;
            System.out.println("Ten: " + ten);
        } else if (number == 100) {
            int hundred = ((number / 100) % 10) * 100;
            System.out.println("Hundred: " + hundred);
        } else if (number == 1000) {
            int thousand = ((number / 1000) % 10) * 1000;
            System.out.println("Thousand: " + thousand);
        } else {
            System.out.println("Error...");
        }
    }

}
