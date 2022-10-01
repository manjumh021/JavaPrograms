/*
4. Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
    (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
*/


import java.util.Scanner;

public class HarmonicNumber {
    static int getUserInput(){
        System.out.println("Enter nth harmonic number : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value<=0){
            System.out.println("Enter Number greater than zero.");
            value = getUserInput();
        }
        return value;
    }
    static void nthHarmonicSum(int value){
        double sum = 0;
        for (int i=1; i<=value;i++){
            sum += (double)1/i;
            if(i<value)
                System.out.print("1/"+i+" + ");
            else
                System.out.print("1/"+i+" ");
        }
        System.out.println("= "+sum);
    }
    public static void main(String[] args){
        
        int value = getUserInput();
        nthHarmonicSum(value);
    }
}