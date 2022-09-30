// Demonstrate static variable , methods, and blocks. 


public class StaticDemo
{
    //static variables
    static int m=2;
    static int n;

    //static block
    static
    {
        n = 6*m;
        System.out.println ("Static block variable 'n':" + n);
    }

    //static method
    static void staticMethod(int A)
    {

        System.out.println("static method invoked");
        System.out.println ("A =" +A);
        System.out.println("using static variables");
        System.out.println ("m ="+m);
        System.out.println ("n ="+ n);
    }


    public static void main (String args [ ])
    {
        staticMethod(5);
    }
}