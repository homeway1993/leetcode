package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    public void test() {
        // prepare
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(3) {{
            this.left = new MaximumDepthOfBinaryTree.TreeNode(9);
            this.right = new MaximumDepthOfBinaryTree.TreeNode(20) {{
                this.left = new MaximumDepthOfBinaryTree.TreeNode(15);
                this.right = new MaximumDepthOfBinaryTree.TreeNode(7);
            }};
        }};

        // validate
        int result = solution.maxDepth(root);
        assertEquals(3, result);
    }

    @Test
    public void testIfNull() {
        int result = solution.maxDepth(null);
        assertEquals(0, result);
    }
}