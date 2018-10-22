package com.skmuddamsetty.datastructures;

/**
 * Created by sanmuk on 10/20/18.
 */

public class BinaryTree {
    private static int leftSubTreeCount = 0;
    private static int rightSubTreeCount = 0;

    public static void main(String args[]) throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
//        Node root = getRootNode();
        Node root = prepCustomNodes();
        System.out.println(childrenSumParent(root));
    }

    private static int childrenSumParent(Node<Integer> root) {
        int leftData = 0;
        int rightData = 0;
        if (root == null || (root.getLeftChild() == null && root.getRightChild() == null)) {
            return 1;
        } else {
            leftData = root.getLeftChild().getData();
            rightData = root.getRightChild().getData();
            if ((root.getData() == leftData + rightData)
                    && childrenSumParent(root.getLeftChild()) != 0
                    && childrenSumParent(root.getRightChild()) != 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private static void prepNodes(Node root) throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        Node node1 = new Node<>(55);
        Node node2 = new Node<>(45);
        Node node3 = new Node<>(54);
        Node node4 = new Node<>(110);
        Node node5 = new Node<>(105);
        Node node6 = new Node<>(111);
        Node node7 = new Node<>(200);
        insertNode(root, node1);
        insertNode(root, node2);
        insertNode(root, node3);
        insertNode(root, node4);
        insertNode(root, node5);
        insertNode(root, node6);
        insertNode(root, node7);
    }

    private static Node<Integer> prepCustomNodes()
            throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        Node root = new Node<>(100);
        Node node1 = new Node<>(55);
        Node node2 = new Node<>(45);
        Node node3 = new Node<>(11);
        Node node4 = new Node<>(44);
        Node node5 = new Node<>(5);
        Node node6 = new Node<>(7);
        root.setLeftChild(node1);
        root.setRightChild(node2);
        node1.setLeftChild(node3);
        node1.setRightChild(node4);
        node3.setLeftChild(node5);
        node3.setRightChild(node6);
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

    private static Node<Integer> getRootNode() {
        return new Node<>(110);
    }


    private static void printBinaryTreeUsingBreadthFirstTraversal(Node root)
            throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new Queue<>(Node.class);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.dequeue();
            print(currentNode);
            if (currentNode.getLeftChild() != null) {
                queue.enqueue(currentNode.getLeftChild());
            }
            if (currentNode.getRightChild() != null) {
                queue.enqueue(currentNode.getRightChild());
            }
        }
    }

    private static void preOrder(Node<Integer> root) {
        if (root == null) {
            return;
        }
        print(root);
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    private static void printHeightOfBinaryTree(Node<Integer> root)
            throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        computeLeftSubTreeHeight(root);
        computeRightSubTreeHeight(root);
        System.out.println("Height of Left Sub Tree :" + leftSubTreeCount);
        System.out.println("Height of Right Sub Tree :" + rightSubTreeCount);
        System.out.println("Height of Binary Tree:" + Math.max(leftSubTreeCount, rightSubTreeCount));

    }

    private static void computeLeftSubTreeHeight(Node<Integer> root) {
        if (root == null) {
            return;
        }
        computeLeftSubTreeHeight(root.getLeftChild());
        leftSubTreeCount++;
    }

    private static void computeRightSubTreeHeight(Node<Integer> root) {
        if (root == null) {
            return;
        }
        computeRightSubTreeHeight(root.getRightChild());
        rightSubTreeCount++;
    }

    public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }
}
