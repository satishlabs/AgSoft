package com.agsoft;

class Node {
	static Node head;
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() {
	}
}

public class MergeLinkedListAlternatePos {
	public static void main(String[] args) {
		Node a = null;
		Node b = null;

		// create the first list
		for (int i = 1; i <= 2; i++) {
			a = new Node(i, a);
		}

		// create the second list
		for (int i = 3; i <= 4; i++) {
			b = new Node(i, b);
		}

		// Print both list
		printList("First list : ", a);
		printList("Second list : ", b);

		Node[] arr = merge(a, b);
		a = arr[0];
		b = arr[1];

		System.out.println("\nAfter Merge: \n");

		printList("First List: ", a);
		printList("Second List: ", b);
	}

	private static Node[] merge(Node a, Node b) {
		Node temp = new Node();
		Node tail = temp;

		while (true) {
			if (a == null) {
				tail.next = null;
				break;
			} else if (b == null) {
				tail.next = a;
				break;
			} else {
				tail.next = a;
				tail = a;
				a = a.next;

				tail.next = b;
				tail = b;
				b = b.next;
			}
		}
		a = temp.next;
		return new Node[] { a, b };
	}

	private static void printList(String msg, Node head) {
		System.out.println(msg);
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
