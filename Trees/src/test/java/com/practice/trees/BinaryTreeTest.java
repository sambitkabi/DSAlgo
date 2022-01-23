package com.practice.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * root ->            50
 *              40        60
 *          30      45  55     65
 * Preoder : 50 40 30 45 60 55 65
 * <p>
 * <p>
 * Inorder traversal:
 * <p>
 * 1. inorder traversal of left subtree
 * 2. the root
 * 3. inorder traversal of right subtree
 * <p>
 * in(50) -> 40 -> 30 -> print 30 -> 40 -> print 40 -> 45 -> print 45 -> 50 -> print 50
 * -> 60 -> 55 -> print 55 -> 60 -> print 60 -> 65 -> print 65
 * <p>
 * <p>
 * inorder (root) {
 * if root is null return;
 * <p>
 * inorder (root->left);
 * <p>
 * print root.value;
 * <p>
 * inorder (root->right);
 * }
 * <p>
 * 30 40 45 50 55 60 65
 */
public class BinaryTreeTest {


    static BinaryTree buildCompleteBinaryTree() {
        // [30 40 45 50 55 60 65]

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(40);

        root.left.left = new TreeNode(35);
        root.left.right = new TreeNode(45);

        root.right = new TreeNode(60);

        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);

        return new BinaryTree(root);
        //              50 
        //          40 
        //     35        45
        //RLR
        // 50,40,35,45
    }

    static BinaryTree buildLeftUnbalancedBinaryTree() {

        /**
         *          50
         *         40
         *        35
         *       45
         */
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(40);
        root.left.left = new TreeNode(35);
        root.left.left.left = new TreeNode(45);

        return new BinaryTree(root);
    }

    static BinaryTree buildRightUnbalancedBinaryTree() {

        /**
         * 50
         *      60
         *          55
         *              65
         */
        TreeNode root = new TreeNode(50);
        root.right = new TreeNode(60);
        root.right.right = new TreeNode(55);
        root.right.right.right = new TreeNode(65);

        return new BinaryTree(root);
    }

    @Test
    public void testInorderTraversal() {
        BinaryTree binaryTree = buildCompleteBinaryTree();

        List<Integer> expectedList = Arrays.asList(35, 40, 45, 50, 55, 60, 65);

        List<Integer> inorderNodes = binaryTree.inorder();

        Assert.assertEquals(expectedList, inorderNodes);
    }

    @Test
    public void testPreorderTraversal() {
        BinaryTree binaryTree = buildCompleteBinaryTree();

        // 50 40 30 45 60 55 65
        List<Integer> expectedList = Arrays.asList(50, 40, 35, 45, 60, 55, 65);

        List<Integer> preorderNodes = binaryTree.preorder();

        Assert.assertEquals(expectedList, preorderNodes);
    }

     @Test
     public void testInorderTraversalForEmptyTree() {
         BinaryTree binaryTree = new BinaryTree(null);

         List<Integer> inorderNodes = binaryTree.inorder();

         Assert.assertTrue(inorderNodes.isEmpty());
     }

    @Test
    public void testPreorderTraversalForEmptyTree() {
        BinaryTree binaryTree = new BinaryTree(null);

        List<Integer> preorderNodes = binaryTree.preorder();

        Assert.assertTrue(preorderNodes.isEmpty());
    }

     @Test
     public void testLeftUnbalancedInorderTraversal() {
         BinaryTree binaryTree = buildLeftUnbalancedBinaryTree();

         List<Integer> expectedList = Arrays.asList(45,35,40,50);

         List<Integer> inorderNodes = binaryTree.inorder();

         Assert.assertEquals(expectedList, inorderNodes);
     }

    @Test
    public void testLeftUnbalancedPreorderTraversal() {
        BinaryTree binaryTree = buildLeftUnbalancedBinaryTree();

        List<Integer> expectedList = Arrays.asList(50 , 40 , 35 , 45);

        List<Integer> preorderNodes = binaryTree.preorder();

        Assert.assertEquals(expectedList, preorderNodes);
    }

     @Test
     public void testRightUnbalancedInorderTraversal() {
         BinaryTree binaryTree = buildRightUnbalancedBinaryTree();

         List<Integer> expectedList = Arrays.asList(50,60,55,65);

         List<Integer> inorderNodes = binaryTree.inorder();

         Assert.assertEquals(expectedList, inorderNodes);
     }

    @Test
    public void testRightUnbalancedPreorderTraversal() {
        BinaryTree binaryTree = buildRightUnbalancedBinaryTree();

        List<Integer> expectedList = Arrays.asList(50,60,55,65);

        List<Integer> preorderNodes = binaryTree.preorder();

        Assert.assertEquals(expectedList, preorderNodes);
    }
}
