package com.example.leetcode;

class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 != null & t2 != null) {
            return viewTrees(t1, t2, new TreeNode(t1.val + t2.val));
        } else if (t1 != null) {
            return viewTrees(t1, new TreeNode(0), new TreeNode(t1.val));
        } else if (t2 != null) {
            return viewTrees(new TreeNode(0), t2, new TreeNode(t2.val));
        } else {
            return null;
        }
    }

    public TreeNode viewTrees(TreeNode t1, TreeNode t2, TreeNode result) {
        if (t1.left == null && t2.left == null && t1.right == null && t2.right == null) {
            return new TreeNode(t1.val + t2.val);
        }

        if (t1.left != null && t2.left != null) {
            result.left = viewTrees(t1.left, t2.left, new TreeNode(t1.left.val + t2.left.val));
        } else if (t1.left != null) {
            result.left = viewTrees(t1.left, new TreeNode(0), new TreeNode(t1.left.val));
        } else if (t2.left != null) {
            result.left = viewTrees(new TreeNode(0), t2.left, new TreeNode(t2.left.val));
        }

        if (t1.right != null && t2.right != null) {
            result.right = viewTrees(t1.right, t2.right, new TreeNode(t1.right.val + t2.right.val));
        } else if (t1.right != null) {
            result.right = viewTrees(t1.right, new TreeNode(0), new TreeNode(t1.right.val));
        } else if (t2.right != null) {
            result.right = viewTrees(new TreeNode(0), t2.right, new TreeNode(t2.right.val));
        }

        return result;
    }


    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
