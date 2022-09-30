//Java Program to find the frequency of each element in the array

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElementsFrequency {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 1 , 2, 2, 3, 4, 4, 4, 4 ,3,3,3,3,3,3,6,6,6,6,6,6};
        System.out.println("Element" + "-->" + "Repeatation");
        String repeatElements[] = new String[0];
        ArrayList<String> myArray = new ArrayList<String>(Arrays.asList(repeatElements));
        for (int i = 0; i < myList.length; i++) {
            boolean  duplicate= false;
            for (int k = 0; k < repeatElements.length; k++) {
                int temp=Integer.parseInt(repeatElements[k]);
                if (myList[i]==temp){
                        duplicate= true;
                }
            }
            if (duplicate== false){
                myArray.add(String.valueOf(myList[i]));
                repeatElements = myArray.toArray(repeatElements);
                int count = 0;
                for (int j = 0; j < myList.length; j++) {
                    if (myList[i]==myList[j]){
                        count +=1;
                    }
                }
                System.out.println(myList[i] + "-->" + count);
            }
        }  
    }
}