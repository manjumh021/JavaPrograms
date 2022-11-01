import java.io.*;
public class RemoveWordUC3 {
    // Method 1
    // To remove the word
    static void remove(String str,String word) {
        // Split the string using split()method
        String msg[] = str.split(" ");
        String new_str = "";
        // Iterating the string using for each loop
        for (String words : msg) {
            //if desired word is found
            if (!words.equals(word)) {
                //Contact the word not equal to the given word
                new_str += words + " ";
            }
        }
        //print the new string
        System.out.println(new_str);
    }
    //Method 2
    //Main method
    public static void main(String[] args) {
        String str =  "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        //word to be removed from above string
        String word = "avoidable";
        remove(str,word);
    }
            }


