package com.blz.binarysearchandhashtable.binarysearchtree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> myBinaryTree = new BinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        System.out.println( myBinaryTree + "Size is : "+size);


    }
}

