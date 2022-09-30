public class DuplicateEntry {  
    public static void main(String[] args) {  
        int [] myList = new int [] {1, 2, 0, 3, 7, 3, 1, 2 };  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < myList.length; i++) {  
            for(int j = i + 1; j < myList.length; j++) {  
                if(myList[i] == myList[j])  
                    System.out.println(myList[j]);  
            }  
        }  
    }  
}  