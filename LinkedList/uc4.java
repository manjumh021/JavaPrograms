// Java program to add string elements to a Queue

import java.util.*;

public class uc4 {

	public static void main(String args[])
	{
		Queue<String> q = new PriorityQueue<>();
        q.add("this");
		q.add("is");
        q.add("Queue");
		System.out.println(q);
        q.remove("Queue");
        System.out.println(q);
        System.out.println("using Poll Method: " + q.poll());
        System.out.println("Final Queue " + q);
	}
}
