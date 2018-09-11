package com.skmuddamsetty.linkedlists;

public class SimpleLinkedList {
	static Node head;

	public static void main(String[] args) {
		SimpleLinkedList llist = new SimpleLinkedList();
		llist.head = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);

		// start linking
		llist.head.next = secondNode;
		secondNode.next = thirdNode;
		// printLinkedList(head);
		// insertElementAtBeginning(head, 0);
		 insertElementAfterSpecifiedNode(secondNode, 9);
		insertElementAtLast(head, 100);
	}

	public static void printLinkedList(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void insertElementAtBeginning(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		printLinkedList(head);
	}

	public static void insertElementAfterSpecifiedNode(Node prevNode, int data) {
		/* 1. Check if the given Node is null */
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		printLinkedList(head);
	}

	public static void insertElementAtLast(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		printLinkedList(head);
	}
}
