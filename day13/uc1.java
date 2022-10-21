public class uc1 {
    public static void main(String[] args) {

        //TC1.1 - given max integer to the first position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",3,1,2,maximum(1,3,2));

        //TC1.2 - given max integer to the second position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",1,3,2,maximum(1,3,2));

        //TC1.3 - given max integer to the third position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",1,2,3,maximum(1,3,2));

        System.out.println("Float Test Cases");
        //TC1.1 - given max integer to the first position
        System.out.printf("Maximum from %f, %f, and %f is:  %f\n",3.33f,1.11f,2.22f,maximum(3.33f,1.11f,2.22f));

        //TC1.2 - given max integer to the second position
        System.out.printf("Maximum from %f, %f, and %f is:  %f\n",1.11f,3.33f,2.22f,maximum(1.11f,3.33f,2.22f));

        //TC1.3 - given max integer to the third position
        System.out.printf("Maximum from %f, %f, and %f is:  %f\n",1.11f,2.22f,3.33f,maximum(1.11f,2.22f,3.33f));

        System.out.printf("Maximum string from %s, %s and %s is:  %s\n","Manju","Ravi","Krishna",maximum("Manju","Ravi","Krishna"));
    }
    public static <T extends Comparable<T>> T maximum(T n1, T n2, T n3) {

        //Initializing the Variable
        T max = n1; 
        if (n2.compareTo(n1) > 0)
            max = n2;

        if (n3.compareTo(max) > 0)
            max = n3;

        return max;
    }
}