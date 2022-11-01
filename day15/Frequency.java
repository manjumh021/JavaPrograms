import java.util.Map;
import java.util.TreeMap;
public class Frequency {
     // Function to count frequency of
    // words in the given string
    static void count_freq(String str) {
        Map<String, Integer> map = new TreeMap<>();
        // Splitting to find the word
        String arr[] = str.split(" ");
        // Loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Loop to iterate over the
        // elements opf the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "To be or not to be";
        // Function call
        count_freq(str);
    }
        }


