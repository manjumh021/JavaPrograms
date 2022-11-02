
import java.util.Scanner;

public class SortSearchStopwatch {
	/*
	 * Static scanner to be used in class for taking out put
	 */
	static Scanner S = new Scanner(System.in);

	/*
	 * Static arrays acting as array to search in
	 */
	static int ARR[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
			27 };
	static String[] AR = { "aa", "bb", "cc", "dd", "ee" };

	/**
	 * Function to check for time for a method
	 */
	static void stopWatch() {
		System.out.println("enter int to search");
		int n = S.nextInt();
		long t1 = System.currentTimeMillis();
		int index = Utility.binary(ARR, n);
		long t2 = System.currentTimeMillis();
		System.out.println("found at index " + index + " in total time " + (t2 - t1) + " milliSeconds");
	}

	/**
	 * main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// int arr[] = {1,2,3,4,5,6,7,8,9};
		// String[] ar = {"aa","bb","cc","dd","ee"};
		SortSearchStopwatch.stopWatch();

	}
}
