/*
Enter two numbers and do the following arithmetic Operations find max and min.
  i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c
*/

import java.util.Scanner;
import java.util.Arrays;

public class ArithmeticManipulation {
    public static void main(String[] args) {
        System.out.println("Enter a b c : ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float result1 = a + b * c ;
        float result2 = c + a / b ;
        float result3 = a % b + c ;
        float result4 = a * b + c ;
        float[] myList = {result1, result2, result3, result4};
        System.out.println("results: " + Arrays.toString(myList));
        Arrays.sort(myList);
        System.out.println("Max: "+ myList[3]);
        System.out.println("Min: "+ myList[0]);
    }
}