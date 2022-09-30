//Java Program to print the elements of an array present on an even position

import java.util.Arrays;

public class EvenPositionElements {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4};
        System.out.println("Array: " + Arrays.toString(myList));
        for (int i = 0; i < myList.length; i++) {
            int temp = i+1;
            if (temp%2==0){
                System.out.println(myList[i] + " ");
            }
        }
    }
}
