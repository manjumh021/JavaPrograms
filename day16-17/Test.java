import customDataStruc.UnorderedList;

public class Test {
	public static void main(String[] args) {
		UnorderedList<Integer> il = new UnorderedList<>();
		il.add(12);
		il.add(33);
		Integer i = 0 ;
		Integer s = 5 ;
		// Integer s = il.pop(1);
		System.out.println(il);
	}
}
