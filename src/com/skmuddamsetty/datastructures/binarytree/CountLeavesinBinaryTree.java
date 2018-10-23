package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue.QueueOverflowException;
import com.skmuddamsetty.datastructures.Queue.QueueUnderflowException;

public class CountLeavesinBinaryTree {

	private static int leafCount;

	public static int getLeafCount() {
		return leafCount;
	}

	public static void setLeafCount(int leafCount) {
		CountLeavesinBinaryTree.leafCount = leafCount;
	}

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		Node root = getRootNode();
		BinaryTreeUtility.prepNodes(root);
		System.out.println(getNumberOfLeafNodes(root));
	}

	private static int getNumberOfLeafNodes(Node<Integer> node) {
		if (node == null) {
			return getLeafCount();
		}
		if (node.getLeftChild() == null && node.getRightChild() == null) {
			leafCount++;
		} else {
			getNumberOfLeafNodes(node.getLeftChild());
			getNumberOfLeafNodes(node.getRightChild());
		}
		return getLeafCount();
	}

	private static Node<Integer> getRootNode() {
		return new Node<>(1);
	}
}
