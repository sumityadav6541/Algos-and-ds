package algos.Algos_and_ds.easy.list;

import java.util.Arrays;

import algos.Algos_and_ds.commons.Node;

public class MergeTwoSortedLinkedList {
	public static void main(String[] args) {
		int[] a1 = { 10, 12, 14, 16, 18, 20 };
		Node listA = array2List(a1);
		//printList(listA);

		int[] a2 = { 11, 13, 15, 17, 19, 21, 30, 40, 50, 60 };
		Node listB = array2List(a2);
		//printList(listB);

		printList(mergeSortedLists(listA, listB));
		System.out.println();
		printList(listA);
	}

	public static Node mergeSortedLists(Node listA, Node listB) {
		if (listA == null && listB == null)
			return null;
		if (listA == null)
			return listB;
		if (listB == null)
			return listA;
		Node result;

		if (listA.data > listB.data) {
			result = listB;
			listB = listB.next;
		} else {
			result = listA;
			listA = listA.next;
		}
		Node temp = result;
		while (listA != null && listB != null) {
			if (listA.data > listB.data) {
				temp.next = listB;
				listB = listB.next;
			} else {
				temp.next = listA;
				listA = listA.next;
			}
			temp = temp.next;
		}

		if (listA != null)
			temp.next = listA;
		if (listB != null)
			temp.next = listB;

		return result;
	}

	public static void printList(Node head) {
		if (head == null)
			return;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static Node array2List(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;

		Arrays.sort(arr);
		Node head = new Node(arr[0]);
		Node temp = head;
		for (int i = 1; i < arr.length; i++) {
			temp.next = new Node(arr[i]);
			temp = temp.next;
		}
		return head;
	}
}
