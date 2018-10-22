package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue;

public class MirrorTree {
    static int leftSubTreeCount = 0;

    public static void main(String[] args)
            throws Queue.QueueUnderflowException, Queue.QueueOverflowException {
        Node root = getRootNode();
        BinaryTreeUtility.prepNodes(root);
        System.out.println(getTreeHeight(root));
    }

    private static Node<Integer> getRootNode() {
        return new Node<>(1);
    }

    private static int getTreeHeight(Node<Integer> root) {
        if (root == null) {
            return leftSubTreeCount;
        }
        System.out.println("Processing Node - " + root.getData());
        leftSubTreeCount++;
        return Math.max(getTreeHeight(root.getLeftChild()), getTreeHeight(root.getRightChild()));
    }

}
