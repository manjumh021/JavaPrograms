/*
Write a program SpringSeason.java that takes two int values m and d from the command line 
and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), 
false otherwise.
*/

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        System.out.println("Enter the Month and Day between Mar 20 and June 20: ");
        Scanner scanner = new Scanner(System.in);
        Integer month = scanner.nextInt();
        Integer day = scanner.nextInt();
        boolean validDate= false;
        switch (month) {
            case 3:
                if (day>=20 && day<=31){
                    validDate= true;
                }
                break;
            case 4:
                if (day>=1 && day<=30){
                    validDate= true;
                }
                break;
            case 5:
                if (day>=1 && day<=31){
                    validDate= true;
                }
                break;
            case 6:
                if (day>=1 && day<=20){
                    validDate= true;
                }
                break;
            default:
                System.out.println("Please Input valid date.");
                break;
        }
        if (validDate){
            System.out.println("valid date.");
        }
        else{
            System.out.println("Invalid date");
        }
    }
}