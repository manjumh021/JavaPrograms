/* 
3. Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the 
   powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
*/

import java.util.Scanner;
import java.lang.Math;

public class PowerOfTwo {
    static int getUserInput(){
        System.out.println("Enter power of two : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value<0 || value>32){
            System.out.println("Enter Number between 1 and 31.");
            value = getUserInput();
        }
        return value;
    }
    static void powOfTwoTable(int value){
        for (int i=0; i<=value;i++){
            System.out.println("2^"+i+" ="+Math.pow(2,i));
        }
    }
    public static void main(String[] args){
        int value = getUserInput();
        powOfTwoTable(value);
    }
}