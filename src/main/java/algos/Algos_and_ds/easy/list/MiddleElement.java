package algos.Algos_and_ds.easy.list;

import algos.Algos_and_ds.commons.Node;

public class MiddleElement {
	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(4);
		head.next.next = new Node(6);
		head.next.next.next = new Node(8);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(12);
		//head.next.next.next.next.next.next = new Node(14);
		
		System.out.println(getMiddle(head));
	}
	
	// running time complexity is O(n) in single pass
	private static int getMiddle(Node head) {
		if(head==null)
			throw new RuntimeException("Empty List");
		
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer.next!=null && fastPointer.next.next!=null){
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer.data;
	}

	private static void printList(Node head) {
		if(head==null)
			return;
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
			
	}
	
	
}
