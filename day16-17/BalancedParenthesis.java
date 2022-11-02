
import customDataStruc.Stack;

public class BalancedParenthesis {


	static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			/*
			 * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
			 * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
			 */
			char c = s.charAt(i);
			if (c == '(')
				st.push(s.charAt(i));
			else if (c == ')')
				st.pop();
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {

		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(s)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
	}
}
