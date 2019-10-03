package com.example.leetcode;

import com.example.leetcode.definition.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertBinaryTreeTest {

    private InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    public void test1() {
        // prepare
        TreeNode treeNode = new TreeNode(4) {{
            left = new TreeNode(2) {{
                left = new TreeNode(1);
                right = new TreeNode(3);
            }};
            right = new TreeNode(7) {{
                left = new TreeNode(6);
                right = new TreeNode(9);
            }};
        }};

        // validate
        TreeNode result = solution.invertTree(treeNode);

        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }
}