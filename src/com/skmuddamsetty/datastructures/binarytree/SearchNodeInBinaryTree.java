package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue;
import com.skmuddamsetty.datastructures.Queue.QueueOverflowException;
import com.skmuddamsetty.datastructures.Queue.QueueUnderflowException;

public class SearchNodeInBinaryTree {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		Node<Integer> root = BinaryTreeUtility.prepBinaryTree();
		System.out.println(searchNode(root, new Node<Integer>(380)));
	}

	private static int searchNode(Node<Integer> root, Node<Integer> searchNode)
			throws QueueOverflowException, QueueUnderflowException {
		Queue<Node> queue = new Queue<>(Node.class);
		int nodeFound = 0;
		if (root == null) {
			return nodeFound;
		} else {
			queue.enqueue(root);
			while (!queue.isEmpty()) {
				Node<Integer> currentNode = queue.dequeue();
				if (currentNode.getData().equals(searchNode.getData())) {
					nodeFound = 1;
					break;
				} else if (searchNode.getData() < currentNode.getData()) {
					queue.enqueue(currentNode.getLeftChild());
				} else if (searchNode.getData() > currentNode.getData()) {
					queue.enqueue(currentNode.getRightChild());
				}
			}
		}

		return nodeFound;
	}
}
