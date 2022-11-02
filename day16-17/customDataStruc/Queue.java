package customDataStruc;

public class Queue<T> {

	int capacity = 5;
	private Object queue[] = new Object[capacity];
	private int front = -1;
	int rear;
	int size;

	void enque(T item) {
		if (size == capacity) {
			expand();
		}
		queue[rear++] = item;
		size++;
	}

	void deque() {
		if (size > 0) {
			if (size < capacity / 2) {
				shrink();
			}
			queue[++front] = null;
			size--;
		}
	}

	void expand() {
		Object[] newar = new Object[capacity * 2];
		capacity *= 2;
		for (int i = front + 1; i < rear; i++) {
			newar[i] = queue[i];
		}
		queue = newar;
	}

	void shrink() {
		Object newar[] = new Object[(capacity * 3) / 4];
		capacity = (capacity * 3) / 4;
		int j = 0;
		for (int i = front + 1; i < rear; i++) {
			newar[j++] = queue[i];
		}
		front = -1;
		rear = size;
		queue = newar;
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	@Override
	public String toString() {
		String s = "{ ";
		for (int i = front + 1; i < rear; i++) {
			s = s + queue[i] + ", ";
		}
		s = s + "}";
		return s;
	}

}
