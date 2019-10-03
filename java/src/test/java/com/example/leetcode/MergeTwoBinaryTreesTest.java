package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoBinaryTreesTest {

    private MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();

    @Test
    public void test1() {
        // prepare
        MergeTwoBinaryTrees.TreeNode tree1 = new MergeTwoBinaryTrees.TreeNode(1) {{
            this.left = new MergeTwoBinaryTrees.TreeNode(3) {{
                this.left = new MergeTwoBinaryTrees.TreeNode(5);
            }};
            this.right = new MergeTwoBinaryTrees.TreeNode(2);
        }};

        MergeTwoBinaryTrees.TreeNode tree2 = new MergeTwoBinaryTrees.TreeNode(2) {{
            this.left = new MergeTwoBinaryTrees.TreeNode(1) {{
                this.right = new MergeTwoBinaryTrees.TreeNode(4);
            }};
            this.right = new MergeTwoBinaryTrees.TreeNode(3) {{
                this.right = new MergeTwoBinaryTrees.TreeNode(7);
            }};
        }};

        // validate
        MergeTwoBinaryTrees.TreeNode result = solution.mergeTrees(tree1, tree2);
        assertEquals(3, result.val);
        assertEquals(4, result.left.val);
        assertEquals(5, result.left.left.val);
        assertEquals(4, result.left.right.val);
        assertEquals(5, result.right.val);
        assertEquals(7, result.right.right.val);
    }

    @Test
    public void test2() {
        // prepare
        MergeTwoBinaryTrees.TreeNode tree2 = new MergeTwoBinaryTrees.TreeNode(1);

        // validate
        MergeTwoBinaryTrees.TreeNode result = solution.mergeTrees(null, tree2);
        assertEquals(1, result.val);
    }
}