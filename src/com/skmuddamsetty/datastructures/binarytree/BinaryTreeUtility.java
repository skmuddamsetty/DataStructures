package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue;

public class BinaryTreeUtility {

	public static Node<Integer> prepNodesUsingCustomOrder(Node<Integer> root)
			throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		Node<Integer> node6 = new Node<>(6);
		Node<Integer> node7 = new Node<>(7);
		Node<Integer> node8 = new Node<>(8);
		Node<Integer> node9 = new Node<>(9);
		Node<Integer> node10 = new Node<>(10);
		Node<Integer> node11 = new Node<>(11);
		Node<Integer> node12 = new Node<>(12);
		Node<Integer> node13 = new Node<>(13);
		Node<Integer> node14 = new Node<>(14);
		Node<Integer> node15 = new Node<>(15);
		Node<Integer> node16 = new Node<>(16);
		Node<Integer> node17 = new Node<>(17);
		root.setLeftChild(node2);
		root.setRightChild(node3);
		node2.setLeftChild(node4);
		node2.setRightChild(node5);
		node4.setLeftChild(node6);
		node4.setRightChild(node7);
		node7.setLeftChild(node8);
		node7.setRightChild(node9);
		node8.setLeftChild(node10);
		node3.setRightChild(node11);
		node11.setLeftChild(node12);
		node12.setLeftChild(node13);
		node12.setRightChild(node14);
		node14.setLeftChild(node15);
		node15.setLeftChild(node16);
		node15.setRightChild(node17);
		return root;
	}

	public static Node<Integer> prepNodes(Node<Integer> root)
			throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
		return root;
	}

	public static Node<Integer> prepBinaryTree() throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
		Node<Integer> root = new Node<>(200);
		insertNode(root, new Node<Integer>(50));
		insertNode(root, new Node<Integer>(1));
		insertNode(root, new Node<Integer>(350));
		insertNode(root, new Node<Integer>(35));
		insertNode(root, new Node<Integer>(100));
		insertNode(root, new Node<Integer>(275));
		insertNode(root, new Node<Integer>(400));
		insertNode(root, new Node<Integer>(45));
		insertNode(root, new Node<Integer>(75));
		insertNode(root, new Node<Integer>(150));
		insertNode(root, new Node<Integer>(290));
		insertNode(root, new Node<Integer>(375));
		insertNode(root, new Node<Integer>(285));
		insertNode(root, new Node<Integer>(300));
		insertNode(root, new Node<Integer>(360));
		insertNode(root, new Node<Integer>(380));
		
		return root;
	}

	private static void insertNode(Node<Integer> root, Node<Integer> node)
			throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new Queue<>(Node.class);
		queue.enqueue(root);
		Node<Integer> currentNode = null;
		while (!queue.isEmpty()) {
			currentNode = queue.dequeue();
			if (node.getData() <= currentNode.getData()) {
				if (currentNode.getLeftChild() != null) {
					queue.enqueue(currentNode.getLeftChild());
				} else {
					currentNode.setLeftChild(node);
				}
			}
			if (node.getData() >= currentNode.getData()) {
				if (currentNode.getRightChild() != null) {
					queue.enqueue(currentNode.getRightChild());
				} else {
					currentNode.setRightChild(node);
				}
			}
		}

	}

	public static void printBinaryTreeUsingPreOrder(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printNode(root);
		printBinaryTreeUsingPreOrder(root.getLeftChild());
		printBinaryTreeUsingPreOrder(root.getRightChild());
	}
	
	public static void printBinaryTreeUsingInOrder(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printBinaryTreeUsingInOrder(root.getLeftChild());
		printNode(root);
		printBinaryTreeUsingInOrder(root.getRightChild());
	}
	
	public static void printBinaryTreeUsingPostOrder(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printBinaryTreeUsingPostOrder(root.getLeftChild());
		printBinaryTreeUsingPostOrder(root.getRightChild());
		printNode(root);
	}

	public static void printNode(Node node) {
		System.out.print(node.getData() + "->");
	}
}
