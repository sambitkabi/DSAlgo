package com.practice.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    TreeNode _root;

    public BinaryTree(TreeNode root) {
        _root = root;
    }

    public List<Integer> inorder() {
        List<Integer> inorderList = new ArrayList<>();
        traverseInorder(_root, inorderList);
        return inorderList;
    }

    private void traverseInorder(TreeNode treeNode, List<Integer> inorderList) {
        if (treeNode == null) return;

        traverseInorder(treeNode.left, inorderList);

        inorderList.add(treeNode.val);

        traverseInorder(treeNode.right, inorderList);

    }

    public List<Integer> preorder() {
        List<Integer> inorderList = new ArrayList<>();
        traversePreorder(_root, inorderList);
        return inorderList;
    }

    private void traversePreorder(TreeNode treeNode, List<Integer> inorderList) {
        if (treeNode == null) return;

        inorderList.add(treeNode.val);
        traversePreorder(treeNode.left, inorderList);
        traversePreorder(treeNode.right, inorderList);

    }
}
