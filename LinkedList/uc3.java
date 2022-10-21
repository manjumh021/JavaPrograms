// Java program to add Integer elements to a Queue

import java.util.*;
import java.io.*;

public class StackDemo {
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(15);
		stack.push(30);
		stack.push(20);
		stack.push(5);

		System.out.println("Initial Stack: " + stack);
        for (int i=0;i<stack.size();i++){
            System.out.println("Popping element: "
						+ stack.pop());
            System.out.println("Stack: " + stack);
            System.out.println("next peek value: " + stack.peek());
        }
		System.out.println(" is stack empty: " + stack.isEmpty());
	}
}
