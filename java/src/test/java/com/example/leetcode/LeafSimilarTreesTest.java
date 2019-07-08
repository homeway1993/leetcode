package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeafSimilarTreesTest {

    private LeafSimilarTrees solution = new LeafSimilarTrees();

    @Test
    public void test() {
        // prepare
        LeafSimilarTrees.TreeNode root1 = new LeafSimilarTrees.TreeNode(3) {{
            this.left = new LeafSimilarTrees.TreeNode(5) {{
                this.left = new LeafSimilarTrees.TreeNode(6);
                this.right = new LeafSimilarTrees.TreeNode(2) {{
                    this.left = new LeafSimilarTrees.TreeNode(7);
                    this.right = new LeafSimilarTrees.TreeNode(4);
                }};
            }};
            this.right = new LeafSimilarTrees.TreeNode(1) {{
                this.left = new LeafSimilarTrees.TreeNode(9);
                this.right = new LeafSimilarTrees.TreeNode(8);
            }};
        }};

        LeafSimilarTrees.TreeNode root2 = new LeafSimilarTrees.TreeNode(3) {{
            this.left = new LeafSimilarTrees.TreeNode(1) {{
                this.left = new LeafSimilarTrees.TreeNode(6);
                this.right = new LeafSimilarTrees.TreeNode(7);
            }};
            this.right = new LeafSimilarTrees.TreeNode(5) {{
                this.left = new LeafSimilarTrees.TreeNode(4);
                this.right = new LeafSimilarTrees.TreeNode(2) {{
                    this.left = new LeafSimilarTrees.TreeNode(9);
                    this.right = new LeafSimilarTrees.TreeNode(8);
                }};
            }};
        }};

        // validate
        boolean result = solution.leafSimilar(root1, root2);
        assertTrue(result);
    }

    @Test
    public void test1() {
        // prepare
        LeafSimilarTrees.TreeNode root1 = new LeafSimilarTrees.TreeNode(3) {{
            this.left = new LeafSimilarTrees.TreeNode(5);
            this.right = new LeafSimilarTrees.TreeNode(1) {{
                this.left = new LeafSimilarTrees.TreeNode(9);
                this.right = new LeafSimilarTrees.TreeNode(8);
            }};
        }};

        LeafSimilarTrees.TreeNode root2 = new LeafSimilarTrees.TreeNode(3) {{
            this.left = new LeafSimilarTrees.TreeNode(5);
            this.right = new LeafSimilarTrees.TreeNode(1);
        }};

        // validate
        boolean result = solution.leafSimilar(root1, root2);
        assertFalse(result);
    }
}