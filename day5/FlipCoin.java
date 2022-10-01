/*
1. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
*/

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    static int getUserInput(){
        System.out.println("Enter number of times to flip coins  : ");
        Scanner scanner = new Scanner(System.in);
        int flip = scanner.nextInt();
        if (flip<0){
            System.out.println("Enter positive number.");
            flip = getUserInput();
        }
        return flip;
    }
    public static void main(String[] args){
        int flips = getUserInput();
        boolean HEAD = true;
        int headFlips = 0;
        int tailFlips = 0;
        Random random = new Random(); 
        for(int i=1;i<=flips;i++){
            boolean flipResult = random.nextBoolean();
            if (flipResult==HEAD) {
                headFlips += 1 ;
            }
            else{
                tailFlips += 1;
            }
        }
        System.out.println("Percentage of Head flips : "+ (((float)headFlips/flips)*100));
        System.out.println("Percentage of Head flips : "+ (((float)tailFlips/flips)*100));
    }
}