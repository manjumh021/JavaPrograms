/*
1. FibonacciSeries
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter first two numbers of series x y : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Enter Limit :");
        int limit = scanner.nextInt();
        int nextValue = 0;
        System.out.print("Fibonacci Series :"+ x + " " + y + " ");
        while(nextValue < limit){
            nextValue = x + y;
            x = y;
            y = nextValue;
            System.out.print(nextValue + " ");
        }
    }
}
