//Java Program to sort the elements of an array in ascending order

import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        int[] myList = {10, 2, 8, 4, 1 , -2, 6, 3, -5, -3, 7};
        System.out.print("Unsorted Array: " + Arrays.toString(myList));
        Arrays.sort(myList);
        System.out.println();
        System.out.print("Sorted Array: " + Arrays.toString(myList));
    }
}
