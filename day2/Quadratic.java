/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. 
The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Enter 'a*x*x + b*x + c' equation coefficients(a b c)  : ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        double root1, root2;
        float delta = b*b - 4*a*c ;
        if (delta > 0){
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (delta == 0) {
            root1 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
        
    }
}