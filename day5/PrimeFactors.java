/*
5. Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
*/

import java.util.Scanner;

public class PrimeFactors {
    static int getUserInput(){
        System.out.println("Enter nth number : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value<=1){
            System.out.println("Enter Number greater than one.");
            value = getUserInput();
        }
        return value;
    }
    static void findPrimeFactors(int value){
        int temp = value;
        for (int i=2; i*i<=value;i++){
            while(value%i==0){
                if(value%i==0){
                    if (value != 0){
                        value /= i;
                        System.out.print(i+", ");
                    }
                }
            }
        }
        System.out.println("are Prime Factors of "+temp);
    }
    public static void main(String[] args){
        
        int value = getUserInput();
        findPrimeFactors(value);
    }
}