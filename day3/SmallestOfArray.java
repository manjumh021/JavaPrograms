// Java Program to print the lowest element in an array

import java.util.Arrays;

public class SmallestOfArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4};
        int min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (min > myList[i]){
                min = myList[i];
            }

        }
        System.out.println("Array: " + Arrays.toString(myList));
        System.out.println("min: " + min);
    }
}
