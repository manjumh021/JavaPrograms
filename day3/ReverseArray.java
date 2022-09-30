//Java Program to print the elements of an array in reverse order

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(myList));
        System.out.println("Reversed Array: ");
        for (int i = myList.length-1; i >=0 ; i--) {
            System.out.print(myList[i] + " ");
        }
    }
}
