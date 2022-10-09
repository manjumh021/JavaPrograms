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

public class LineComparisonUsingClass {

    public static void main(String[] args) {
        double[] point1 = new double[2];
        double[] point2 = new double[2];
        double[] results = new double[2];
        Scanner scanner = new Scanner(System.in);
        LineCompare lc = new LineCompare();
        int num;

        for (int i=0;i<2;i++){
            num = 1;
            System.out.println("Enter the co-odinates of Line"+(i+1));
            point1 = lc.getPoints(num);
            point2 = lc.getPoints((num+1));
            double leftPowX = lc.getleftPow(point1[0],point2[0]);
            double leftPowY = lc.getleftPow(point1[1],point2[1]);
            results[i] = lc.getLineLength(leftPowX, leftPowY);
            
        }
        System.out.println("line1 :"+ results[0]);
        System.out.println("line2 :"+ results[1]);
        lc.compareLines(results);
    }
}

public class LineCompare{
    Scanner scanner = new Scanner(System.in);
    public double[] getPoints(int i){
        System.out.printf("Enter point%d co-odinates x%d, y%d  : ",i,i,i);
        double[] points = new double[2];
        points[0] = scanner.nextDouble();        //x
        points[1] = scanner.nextDouble();        //y
        return points;
    }
    public double getleftPow(double coOrdinate1, double coOrdinate2){
        double left = coOrdinate2 - coOrdinate1;
        return Math.pow(left, 2);
    }

    public double getLineLength(double value1, double value2){
        return Math.sqrt(value1 + value2);
    }
    public void compareLines(double[] results){
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