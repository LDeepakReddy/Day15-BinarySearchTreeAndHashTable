package com.blz.binarysearchandhashtable.binarysearchtree;

public class BinaryNode<K extends Comparable<K>> {
    K key;
    BinaryNode right;
    BinaryNode left;

    public BinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }


}

