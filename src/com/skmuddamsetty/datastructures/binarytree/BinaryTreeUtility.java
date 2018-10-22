package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue;

public class BinaryTreeUtility {

    public static Node<Integer> prepNodes(Node root)
            throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        Node node2 = new Node<>(2);
        Node node3 = new Node<>(3);
        Node node4 = new Node<>(4);
        Node node5 = new Node<>(5);
        Node node6 = new Node<>(6);
        Node node7 = new Node<>(7);
        Node node8 = new Node<>(8);
        Node node9 = new Node<>(9);
        Node node10 = new Node<>(10);
        Node node11 = new Node<>(11);
        Node node12 = new Node<>(12);
        Node node13 = new Node<>(13);
        Node node14 = new Node<>(14);
        Node node15 = new Node<>(15);
        Node node16 = new Node<>(16);
        Node node17 = new Node<>(17);
        root.setLeftChild(node2);
        root.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
//        node4.setLeftChild(node6);
//        node4.setRightChild(node7);
//        node7.setLeftChild(node8);
//        node7.setRightChild(node9);
//        node8.setLeftChild(node10);
//        node3.setRightChild(node11);
//        node11.setLeftChild(node12);
//        node12.setLeftChild(node13);
//        node12.setRightChild(node14);
//        node14.setLeftChild(node15);
//        node15.setLeftChild(node16);
//        node15.setRightChild(node17);

//        insertNode(root, node1);
//        insertNode(root, node2);
//        insertNode(root, node3);
//        insertNode(root, node4);
//        insertNode(root, node5);
//        insertNode(root, node6);
//        insertNode(root, node7);
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

    public static void printNode(Node node) {
        System.out.print(node.getData() + "->");
    }
}
