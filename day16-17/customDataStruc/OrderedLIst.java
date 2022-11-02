package customDataStruc;

public class OrderedLIst<T extends Comparable<T>> {
	Node head;
	Node tail;
	int size = 0;

	@SuppressWarnings("unchecked")
	public void add(T data) {

		Node n = head;
		Node temp = new Node(data);
		size++;
		if (head == null) {
			// System.out.println("1st");
			head = temp;
			head.next = tail;
			tail = head;
		} else if (data.compareTo((T) head.data) < 0) {
			// System.out.println("2nd");
			temp.next = head;
			head = temp;
		} else {
			if (data.compareTo((T) tail.data) > 0) {
				tail.next = temp;
				tail = temp;
				return;
			}
			Node prev = null;
			while (data.compareTo((T) n.data) > 0 && n.next != null) {
				prev = n;
				n = n.next;
			}
			prev.next = temp;
			temp.next = n;
		}
	}

	public void remove(T item) {
		Node n = head;
		Node prev = null;
		if (head.data.equals(item)) {
			head = head.next;
			size -= 1;
			return;
		} else if (tail.data.equals(item)) {
			while (!n.next.data.equals(tail.data)) {
				n = n.next;
			}
			n.next = null;
			tail = n;
			return;
		} else {
			while (!n.data.equals(item)) {
				prev = n;
				n = n.next;
			}
			n = n.next;
			prev.next = n;
			n = null;
			size -= 1;
		}
	}

	public boolean search(T item) {
		Node n = head;
		while (n != null) {
			if (n.data.equals(item)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public int index(T item) {
		int index = 0;
		Node n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}

	public T pop() {
		Node n = head;
		Node prev = null;
		while (n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = null;
		tail = prev;
		size -= 1;
		return (T) n.data;
	}

	public T pop(int pos) {
		int index = 0;
		Node prev = null;
		Node n = head;
		if (pos == 0) {
			head = head.next;
			return (T) n.data;
		} else if (pos == size - 1) {
			return pop();
		} else {
			while (index != pos) {
				prev = n;
				n = n.next;
				index++;
			}
			prev.next = n.next;
			size -= 1;
			return (T) n.data;
		}
	}

	@Override
	public String toString() {

		StringBuffer s = new StringBuffer();
		s.append("[ ");
		Node node = head;
		while (node != null) {
			s.append(node.data);
			node = node.next;
			s.append(",");
		}
		s.append(" ]");
		return s.toString();

	}

	public void show() {
		System.out.println(toString());
	}

}
