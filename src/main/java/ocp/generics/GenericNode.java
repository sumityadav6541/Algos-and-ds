package ocp.generics;

public class GenericNode<Type> {
	
	Type data;
	GenericNode<Type> next;
	
	public GenericNode(Type data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		GenericNode<Integer> a = new GenericNode<Integer>(5);
		a.next = new GenericNode<Integer>(6);
		a.next.next = new GenericNode<Integer>(9);
		a.next.next.next = new GenericNode<Integer>(11);
		a.next.next.next.next = new GenericNode<Integer>(13);
		printList(a);
		
		GenericNode<String> a2 = new GenericNode<String>("apple");
		a2.next = new GenericNode<String>("banana");
		a2.next.next = new GenericNode<String>("cauliflower");
		a2.next.next.next = new GenericNode<String>("donut");
		a2.next.next.next.next = new GenericNode<String>("eschew");
		printList(a2);
	
		
		System.out.println(getData(a2));
	}

	private static <Type> Type getData(GenericNode<Type> a2) {
		return a2.data;
	}

	private static <Type> void printList(GenericNode<Type> head) {
		if(head==null)
			return;
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
}
