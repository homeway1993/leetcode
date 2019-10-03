package com.example.leetcode;

import com.example.leetcode.definition.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeafSimilarTreesTest {

    private LeafSimilarTrees solution = new LeafSimilarTrees();

    @Test
    public void test() {
        // prepare
        TreeNode root1 = new TreeNode(3) {{
            this.left = new TreeNode(5) {{
                this.left = new TreeNode(6);
                this.right = new TreeNode(2) {{
                    this.left = new TreeNode(7);
                    this.right = new TreeNode(4);
                }};
            }};
            this.right = new TreeNode(1) {{
                this.left = new TreeNode(9);
                this.right = new TreeNode(8);
            }};
        }};

        TreeNode root2 = new TreeNode(3) {{
            this.left = new TreeNode(1) {{
                this.left = new TreeNode(6);
                this.right = new TreeNode(7);
            }};
            this.right = new TreeNode(5) {{
                this.left = new TreeNode(4);
                this.right = new TreeNode(2) {{
                    this.left = new TreeNode(9);
                    this.right = new TreeNode(8);
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
        TreeNode root1 = new TreeNode(3) {{
            this.left = new TreeNode(5);
            this.right = new TreeNode(1) {{
                this.left = new TreeNode(9);
                this.right = new TreeNode(8);
            }};
        }};

        TreeNode root2 = new TreeNode(3) {{
            this.left = new TreeNode(5);
            this.right = new TreeNode(1);
        }};

        // validate
        boolean result = solution.leafSimilar(root1, root2);
        assertFalse(result);
    }
}