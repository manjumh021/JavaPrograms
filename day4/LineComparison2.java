/*
1.
As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
using the Cartesian system, So that I can calculate its length.
- A Length as 2 Points (x1, y1) and (x2, y2) 
- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

2.
As a fan of geometry, I want to check equality of two lines based on the end points, 
So that I know when two lines are the equal. 

3.
As a fan of geometry, I want to compare two lines based on the end points, So that I know
one line is equal, greater or less than the other line. 
*/

import java.util.Scanner;
import java.lang.Math;

public class LineComparison2 {

    static double getleftPow(double coOrdinate1, double coOrdinate2){
        double left = coOrdinate2 - coOrdinate1;
        return Math.pow(left, 2);
    }

    static double getLineLength(double value1, double value2){
        return Math.sqrt(value1 + value2);
    }

    public static void main(String[] args) {
        double[] results = new double[2];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Enter the co-odinates of Line"+(i+1));
            System.out.println("Enter point1 co-odinates x1, y1  : ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            System.out.println("Enter point2 co-odinates x2, y2  : ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double leftPowX = getleftPow(x1,x2);
            double leftPowY = getleftPow(y1,y2);
            results[i] = getLineLength(leftPowX, leftPowY);
            
        }
        System.out.println("line1 :"+ results[0]);
        System.out.println("line2 :"+ results[1]);
        if (results[0]==results[1]) {  
            System.out.println("Both lines are equal");  
        }
        else if (results[0]>results[1]) {
            System.out.println("Line 1 is greater than Line 2");     
        }
        else {
            System.out.println("Line 2 is greater than Line 1");     
        }
    }
}