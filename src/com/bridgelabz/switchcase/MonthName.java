package com.bridgelabz.switchcase;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 12:");
        int monthnumber = input.nextInt();

        String nameofmonth = "  ";
        for (int i = 1; i <= 12; i++)
        {
            if (monthnumber == i)
            {
                switch (i)
                {
                    case 1:
                        nameofmonth = "January";
                        break;
                    case 2:
                        nameofmonth = "February";
                        break;
                    case 3:
                        nameofmonth = "March";
                        break;
                    case 4:
                        nameofmonth = "April";
                        break;
                    case 5:
                        nameofmonth = "May";
                        break;
                    case 6:
                        nameofmonth= "June";
                        break;
                    case 7:
                        nameofmonth = "July";
                        break;
                    case 8:
                        nameofmonth = "August";
                        break;
                    case 9:
                        nameofmonth = "September";
                        break;
                    case 10:
                        nameofmonth = "October";
                        break;
                    case 11:
                        nameofmonth = "November";
                        break;
                    case 12:
                        nameofmonth = "December";
                        break;
                }
            }
        }




        System.out.println("The month name for " + monthnumber + " is " + nameofmonth );
    }
}
