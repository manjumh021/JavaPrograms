//Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.Scanner;

public class PowerOfTenDisplay {
    public static void main(String[] args) {
        System.out.println("Enter the 10's power Number:");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number==10){
            System.out.println("Ten");
        }
        else if (number==100) {
            System.out.println("Hundred");
        }
        else if (number==1000) {
            System.out.println("Thousand");
        }
        else if (number==10000) {
            System.out.println("Ten Thousand");
        }
        else if (number==100000) {
            System.out.println("One Lac");
        }
        else {
            System.out.println("Entered number is not power of ten number.");
        }

    }
}