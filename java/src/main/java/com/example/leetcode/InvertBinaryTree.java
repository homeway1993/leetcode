package com.example.leetcode;

import com.example.leetcode.definition.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        return invertTree(root, new TreeNode(root.val));
    }

    private TreeNode invertTree(TreeNode root, TreeNode copy) {
        if (root.left != null) {
            copy.right = invertTree(root.left, new TreeNode(root.left.val));
        }

        if (root.right != null) {
            copy.left = invertTree(root.right, new TreeNode(root.right.val));
        }

        return copy;
    }
}
