package customDataStruc;

public class Stack<T> {
	/**
	 * the variable used to init capacity of stack array
	 */
	int capacity = 10;

	/**
	 * Array for storing values in stack with size same as capacity
	 */
	private Object[] stack = new Object[capacity];
	/**
	 * chech for index value of the object
	 */
	private int top = 0;

	public void push(T data) {
		// checks for cpapcity of array
		if (top == capacity) {
			expand();
		}
		// puts data in stack
		stack[top] = data;
		top++;
	}

	public T pop() {
		if (isEmpty()) {
			System.err.println("cant pop , stack is empty");
			return null;
		} else {
			T data = (T) stack[--top];
			stack[top] = null;
			return data;
		}
	}


	public T peek() {
		return (T) stack[top];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int size() {
		return top;
	}

	/**
	 * Function to expand the stack if capacity is reached
	 */
	private void expand() {
		Object[] newStack = new Object[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, top);
		capacity *= 2;
		stack = newStack;
	}

	/**
	 * Function to give elements in stack as string
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		for (int i = 0; i < top; i++) {
			sb.append(stack[i]);
			sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}

}
