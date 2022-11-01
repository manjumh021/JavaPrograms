public class uc2<T extends  Comparable<T>> {
    public T[] inputArray;

    public uc2(T[] inputArray) {
        this.inputArray = inputArray;
    }
    public T getMaximum() {
        return uc2.getMaximum(this.inputArray);
    }
    //Generic method
    public static <T extends Comparable<T>> T getMaximum(T[] inputArray) {
        //Initializing the Variable
        T max1 = inputArray[0];
        for(T element : inputArray) {
            if (element.compareTo(max1)>0) {
                max1 = element;
            }
        }
        printOut(inputArray, max1);
        return max1;
    }
    public static <T> void printOut(T[] array, T large) {
        System.out.print("Maximum of ");
        for(T element : array) {
            System.out.printf("%s  ", element);
        }
        //Printing the max value
        System.out.printf("is:  %s\n",large);
    }
}