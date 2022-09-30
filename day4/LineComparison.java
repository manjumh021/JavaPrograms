/*
As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
using the Cartesian system, So that I can calculate its length.
- A Length as 2 Points (x1, y1) and (x2, y2) 
- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
*/

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        double root1, root2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point1 co-odinates x1, y1  : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter point2 co-odinates x2, y2  : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double leftX = x2 - x1;
        double leftY = y2 - y1;
        double squareXY =  Math.pow(leftX, 2) + Math.pow(leftY, 2);
        double result = Math.sqrt(squareXY);
        System.out.println("Length of line : " + result);
    }
}