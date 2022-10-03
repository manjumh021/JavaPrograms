/*
2. Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
*/

import java.util.Scanner;

public class PerfectNumber {
    static boolean checkPerfect(int value){
        boolean isPerfect = false;
        int sum = 0;
        for (int i=1; i<value;i++){
            if(value%i==0){
              sum += i;  
            }
        }
        if (sum==value){
            isPerfect = true;
        }
        return isPerfect;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPerfect = checkPerfect(x);
        if(isPerfect){
            System.out.println(x + " is perfect number ");
        }
        else
            System.out.println(x + " not perfect number");
        
        // Print Perfect Numbers below the entered number
        for (int j=1;j<=x;j++){
            isPerfect = checkPerfect(j);
            if(isPerfect){
                System.out.print(j +" ");
            }
        }
    }
}