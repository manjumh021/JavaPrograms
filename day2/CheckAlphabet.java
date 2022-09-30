//Write a Program to Check Vowel or Consonant using switch

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet:");
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next().toLowerCase();
        switch (alphabet) {
            case "a":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
            }
    }
}