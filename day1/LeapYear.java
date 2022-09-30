//Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year >= 1584){
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                System.out.println(year + " year is a leap year");
            }
            else {
                System.out.println(year + " year is not a leap year");
            }
        }
        else {
            System.out.println("Year should above the 1582");
        }
    }
}