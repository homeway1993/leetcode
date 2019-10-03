package com.example.leetcode;

import com.example.leetcode.definition.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    public void test() {
        // prepare
        TreeNode root = new TreeNode(3) {{
            this.left = new TreeNode(9);
            this.right = new TreeNode(20) {{
                this.left = new TreeNode(15);
                this.right = new TreeNode(7);
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