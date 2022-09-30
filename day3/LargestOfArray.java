// Java Program to print the largest element in an array

import java.util.Arrays;

public class LargestOfArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4};
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]){
                max = myList[i];
            }

        }
        System.out.println("Array: " + Arrays.toString(myList));
        System.out.println("max: " + max);

        // Find 2nd Largest Number in an Array
        int secondMax = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (max > myList[i] && myList[i] > secondMax){
                secondMax = myList[i];
            }
        }
        System.out.println("Second max: " + secondMax);
    }
}
