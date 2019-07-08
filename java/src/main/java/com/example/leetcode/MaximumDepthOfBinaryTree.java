package com.example.leetcode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : findDepth(root, 1);
    }

    public int findDepth(TreeNode root, int currentDepth) {
        if (root.left == null && root.right == null) {
            return currentDepth;
        }

        int leftDepth = 0;
        int rightDepth = 0;

        if (root.left != null) {
            leftDepth = findDepth(root.left, currentDepth + 1);
        }

        if (root.right != null) {
            rightDepth = findDepth(root.right, currentDepth + 1);
        }

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
