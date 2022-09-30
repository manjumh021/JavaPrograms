// Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;

public class ReverseNumAndCheckPolyndrome {
    public static void main(String[] args) {
        int reversed = 0 ;
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        int temp = number;
        while(temp!=0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
        
        // Write a Program to find Palindrome Number
        if (number!=reversed)
            System.out.println("Entered number is not polyndrome");
        else
            System.out.println("Entered number is polyndrome");

    }
}