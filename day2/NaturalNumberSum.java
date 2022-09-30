// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        System.out.println("Enter natural Number:");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        //using for loop
        int sum1 = 0;
        for(int i=1;i<=number;i++){
            sum1+=i;
        }
        System.out.println("Sum of natural numbers: "+sum1);

        // using while loop
        int sum2=0;
        while (number>=1){
            sum2+=number;
            number-=1;
        }
        System.out.println("Sum of natural numbers: "+sum2);
    }
}