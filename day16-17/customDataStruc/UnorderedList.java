package customDataStruc;

public class UnorderedList<T> {
	private Node head;
	Node tail;
	private int size = 0;

	@SuppressWarnings("Unchecked")

	public void add(T data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			size++;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			// adds the node as last node
			node.next = n;
			size++;
		}
	}

	public void remove(T item) {
		Node n = head;
		Node prev = null;
		if (head.data.equals(item)) {
			head = head.next;
			size -= 1;
			return;
		}
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		n = n.next;
		prev.next = n;
		n = null;
		size -= 1;
	}

	public void removeAtLast() {
		Node n = head;
		Node prev = null;
		while (n.next != null) {
			prev = n;
			n = n.next;
		}
		System.out.println("hheeyy");
		// remove the node as last node
		prev.next = null;
		size--;
	}

	public boolean search(T item) {
		Node n = head;
		while (n.next != null) {
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


	public void insert(int pos, T item) throws IndexOutOfBoundsException {
		if (pos > size || pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		int index = 0;
		Node n = head;
		Node node = new Node(item);
		if (pos == 0) {
			node.next = head;
			head = node;
		} else {
			while (index != pos) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		size++;
	}

	public T pop() {
		Node n = head;
		if (size == 1) {
			head = head.next;
			size--;
			return (T) n.data;
		}
		while (n.next != null) {
			n = n.next;
		}
		T ret = (T) n.data;
		n = n.next;
		size -= 1;
		return ret;
	}

	public T pop(int pos) {
		int index = 0;
		Node n = head;
		if (pos == 0) {
			head = head.next;
			size--;
			return (T) n.data;
		}
		Node prev = null;
		while (index != pos) {
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;
		size -= 1;
		return (T) n.data;
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
