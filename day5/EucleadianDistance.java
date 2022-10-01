/*
Write a program Distance.java that takes two integer command-line arguments x and y 
and prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/
import java.util.Scanner;
import java.lang.Math;

public class EucleadianDistance {
    public static void main(String[] args) {
        System.out.println("Enter x y : ");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        double xx =  Math.pow(x, 2);
        double yy =  Math.pow(y, 2);
        double sum = xx + yy ;
        double result = Math.sqrt(sum);
        System.out.println("Distance : "+ result);
    }
}
