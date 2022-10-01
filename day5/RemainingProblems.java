/*
6. Java Program to Compute Quotient and Remainder
7. Java Program to Swap Two Numbers
8. Java Program to Check Whether a Number is Even or Odd
9. Java Program to Check Whether an Alphabet is Vowel or Consonant
10. Java Program to Find the Largest Among Three Numbers
*/

import java.util.Scanner;
import java.util.Arrays;

public class RemainingProblems {
    static int getUserInput(){
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value<=0){
            System.out.println("Enter Number greater than zero.");
            value = getUserInput();
        }
        return value;
    }
    static void divide(){
        System.out.println("Enter devise.");
        int devise = getUserInput();
        System.out.println("Enter deviser.");
        int deviser = getUserInput();
        System.out.println("Remainder: " + (devise%deviser) + " Quotient: "+(devise/deviser));
    }
    static void swap(){
        System.out.println("Enter first no.");
        int first = getUserInput();
        System.out.println("Enter second no.");
        int second = getUserInput();
        int temp = second;
        second = first;
        first = temp;
        System.out.println("First: " + first + " Second: "+ second);
    }
    static void evnOdd(){
        int no = getUserInput();
        if (no%2==0){
            System.out.println("Even ");
        }
        else{
            System.out.println("Odd ");
        }
    }
    static void checkAlphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet:");
        char alphabet = scanner.next().charAt(0);
        char[] vowels = {'a','e','i','o','u'};
        boolean isVowel = false;
        for (int i=0;i<vowels.length;i++){
            if (alphabet==vowels[i]){
                isVowel= true;
            }
        }
        if (isVowel){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    static void checkMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] numbers = {a,b,c};
        Arrays.sort(numbers);
        System.out.println("Largest :"+ numbers[2]);
    }
    public static void main(String[] args){
        divide();
        swap();
        evnOdd();
        checkAlphabet();
        checkMax();
    }
}