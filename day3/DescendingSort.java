//Java Program to sort the elements of an array in descending order

import java.util.Arrays;

public class DescendingSort {
    public static void main(String[] args) {
        int[] myList = {10, 2, 8, 4, 1 , -2, 6, 3, -5, -3, 7};
        System.out.print("Unsorted Array: " + Arrays.toString(myList));
        Arrays.sort(myList);
        System.out.println();
        System.out.print("Descending Array: ");
        for (int i = myList.length-1; i >= 0; i--) {
            System.out.print(myList[i] + " ");
        }
    }
}
