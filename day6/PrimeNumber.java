/*
3. Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
*/
import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrime(int value){
        for (int i=2; i*2 <=value; i++ ){
            if(value%i==0){
              return false;  
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPrime = checkPrime(x);
        if(isPrime){
            System.out.println(x + " is prime number ");
        }
        else
            System.out.println(x + " not prime number");
        
        // Print prime Numbers below the entered number
        for (int j=1;j<=x;j++){
            isPrime = checkPrime(j);
            if(isPrime){
                System.out.print(j +" ");
            }
        }
    }
}