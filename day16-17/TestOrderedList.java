
import java.io.File;
import java.util.Scanner;

/**
 * importing custom ordred list
 */
import customDataStruc.OrderedLIst;

public class TestOrderedList {

	static void addRemove(int num, OrderedLIst<Integer> list) {
		if (list.search(num)) {
			list.remove(num);
			System.out.println("found and removed");
			System.out.println(list);
		} else {
			list.add(num);
			System.out.println("number not found hence added");
			System.out.println(list);
		}
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		OrderedLIst<Integer> list = new OrderedLIst<>();
		Scanner s = new Scanner(System.in);
		System.out.println("how many no to enter");
		int n = s.nextInt();
		System.out.println("enter no");
		for (int i = 0; i < n; i++) {
			System.out.println("enter " + i + " no");
			list.add(s.nextInt());
		}
		System.out.println("enter no to search");
		int number = s.nextInt();
		addRemove(number, list);

	}
}
