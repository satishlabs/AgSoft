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
