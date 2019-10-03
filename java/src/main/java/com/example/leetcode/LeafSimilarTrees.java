package com.example.leetcode;

import com.example.leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = findSequence(root1, new ArrayList<>());
        List<Integer> sequence2 = findSequence(root2, new ArrayList<>());

        return sequence1.equals(sequence2);
    }

    List<Integer> findSequence(TreeNode root, List<Integer> sequence) {
        if (root.left == null && root.right == null) {
            sequence.add(root.val);
        }

        if (root.left != null) {
            findSequence(root.left, sequence);
        }

        if (root.right != null) {
            findSequence(root.right, sequence);
        }

        return sequence;
    }
}
