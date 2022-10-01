/*
2. Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
*/

import java.util.Scanner;

public class LeapYearUsingFunction {
    static int getUserInput(){
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int numberOfDigits = String.valueOf(year).length();
        if (numberOfDigits<4){
            System.out.println("Enter correct year.");
            year = getUserInput();
        }
        return year;
    }
    static boolean checkLeapYear(int year){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                return true;
        }
        else {
                return false;
        }
    }
    public static void main(String[] args){
        int year = getUserInput();
        boolean isLeapYear = checkLeapYear(year);
        if (isLeapYear){
            System.out.println(year + " year is a leap year");
        }
        else{
            System.out.println(year + " year is not a leap year");
        }
    }
}