// Program to get the name using the command line.

import java.util.Scanner;

public class GetNameFromCommand {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the name: ");
        String name = input.next();
        System.out.println("Hello "+name);
    }
}