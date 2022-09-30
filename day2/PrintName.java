import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Your name is: " + name);
    }
}