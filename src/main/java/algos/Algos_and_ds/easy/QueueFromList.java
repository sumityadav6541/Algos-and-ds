package algos.Algos_and_ds.easy;

import algos.Algos_and_ds.commons.Node;

public class QueueFromList {

	private Node head;
	private Node tail;

	public static void main(String[] args) {
		QueueFromList queue = new QueueFromList();

		// test 1
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);

		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		System.out.println(queue.dequeue());

		// test 2
		queue.enqueue(10);
		queue.enqueue(20);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.dequeue());
	}

	// O(1) operation
	private int dequeue() {
		if (head == null)
			return -1;

		Node temp = head;
		head = head.next;
		return temp.data;

	}

	// O(1) operation
	private boolean isEmpty() {
		return head == null;
	}

	// O(1) operation
	private void enqueue(int i) {
		if (head == null) {
			head = new Node(i);
			tail = head;
		} else {
			tail.next = new Node(i);
			tail = tail.next;
		}
	}
}
