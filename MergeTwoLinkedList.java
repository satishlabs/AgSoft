package com.agsoft;

public class MergeTwoLinkedList {
	static Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		MergeTwoLinkedList list1 = new MergeTwoLinkedList();
		MergeTwoLinkedList list2 = new MergeTwoLinkedList();

		list1.push(1);
		list1.push(2);

		System.out.println("First Linked List:");
		list1.display();

		list2.push(3);
		list2.push(4);

		System.out.println("Second Linked List:");
		list2.display();

		list1.merge(list2);

		System.out.println("Modified first linked list:");
		list1.display();

		System.out.println("Modified second linked list:");
		list2.display();
	}

	private void merge(MergeTwoLinkedList list2) {
		Node pCurrent = head;
		Node qCurrent = head;
		Node pNext, qNext;

		while (pCurrent != null && qCurrent != null) {

			// Save next pointers
			pNext = pCurrent.next;
			qNext = qCurrent.next;

			// make qCurrent as next of pCurrent
			qCurrent.next = pNext;
			pCurrent.next = qCurrent;

			// Update current address to next iteration
			pCurrent = pNext;
			qCurrent = qNext;
		}

		list2.head = qCurrent;

	}

	private void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
}
