package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue;
import com.skmuddamsetty.datastructures.Queue.QueueOverflowException;
import com.skmuddamsetty.datastructures.Queue.QueueUnderflowException;

public class MinimumElementInBinaryTree {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		Node<Integer> root = BinaryTreeUtility.prepBinaryTree();
		System.out.println(getMinElement(root));
		BinaryTreeUtility.printBinaryTreeUsingInOrder(root);
		BinaryTreeUtility.printBinaryTreeUsingPostOrder(root);
	}

	private static int getMinElement(Node<Integer> root) throws QueueOverflowException, QueueUnderflowException {
		int minElement = 0;
		if (root.getLeftChild() != null) {
			return getMinElement(root.getLeftChild());
		} else {
			minElement = root.getData();
		}
		return minElement;

	}
}
