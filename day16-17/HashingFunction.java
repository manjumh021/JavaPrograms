import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import customDataStruc.OrderedLIst;

public class HashingFunction {
	OrderedLIst<Integer> list[] = new OrderedLIst[11];

	public HashingFunction() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new OrderedLIst<>();
		}
	}

	void put(int n) {
		list[n % 11].add(n);
	}

	boolean search(int n) {
		return list[n % 11].search(n);
	}

	public static void main(String[] args) {
		HashingFunction hf = new HashingFunction();
		OrderedLIst<Integer> ll = new OrderedLIst<>();
		System.out.println("sout no of elements to add");
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			ll.add(s.nextInt());
		}

	}
}
