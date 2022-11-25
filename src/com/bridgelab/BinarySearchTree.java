package com.bridgelab;

//UC1 - Ability to create a BST by adding 56 and then adding 30 & 70

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){ root = insert(root, value);}

    public TreeNode insert(TreeNode root, int value){
        if(root == null || root.data == value){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        }else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Binary Search Tree (BST) Problems By Using Java");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
    }
}
