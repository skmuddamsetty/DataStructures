package com.skmuddamsetty.datastructures.binarytree;

import com.skmuddamsetty.datastructures.Node;
import com.skmuddamsetty.datastructures.Queue.QueueOverflowException;
import com.skmuddamsetty.datastructures.Queue.QueueUnderflowException;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        Node root = getRootNode();
        BinaryTreeUtility.prepNodes(root);
        System.out.println(heightOfTree(root));
    }

    public static int heightOfTree(Node root) {
        if (null == root)
            return 0;
        int hLeftSub = heightOfTree(root.getLeftChild());
        int hRightSub = heightOfTree(root.getRightChild());
        return Math.max(hLeftSub, hRightSub) + 1;
    }

    private static Node<Integer> getRootNode() {
        return new Node<>(1);
    }
}
