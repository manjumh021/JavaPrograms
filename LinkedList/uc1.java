import java.util.*;

public class uc1 {

	public static void main(String args[])
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(56);
		ll.add(30);
        ll.add(70);		
		System.out.println(ll);       
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}
