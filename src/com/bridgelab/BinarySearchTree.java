package com.bridgelab;

//UC3 - Ability to search 63 in the Binary Tree

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

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(TreeNode root, int key){
        if (root == null || root.data == key){
            return root;
        }
        if (key < root.data){
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary Search Tree (BST) Problems By Using Java");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        bst.inOrder(bst.root);

        System.out.println();
        System.out.print("Searching :::::::::: ");

        TreeNode temp = bst.search(bst.root, 63);
        if (temp == null){
            System.out.println("No data found...!!!");
        } else {
            System.out.println(temp.data);
        }
    }
}
