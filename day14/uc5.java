// Java program to demonstrate the removal of elements in deque

import java.util.*;
public class uc5 {
	public static void main(String[] args)
	{
		Deque<String> dq = new ArrayDeque<String>();

		dq.add("2");
		dq.addFirst("1");
		dq.addLast("3");
        dq.addLast("4");

		System.out.println("deque list: "+dq);
        System.out.println("pop first: "+dq.pollFirst());
        System.out.println("deque list: "+dq);
		System.out.println("pop last: "+dq.pollLast());
        System.out.println("deque list: "+dq);
		System.out.println("pop: "+dq.pop());
        System.out.println("deque list: "+dq);
		System.out.println("poll: "+dq.poll());
        System.out.println("deque list: "+dq);
		
	}
}
