package com.blz.binarysearchandhashtable.binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }

    public int searchKey(K key) {
        return this.searchKeyRecursively(root, key);
    }


    private BinaryNode addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = this.addRecursively(current.left, key);
        } else {
            current.right = this.addRecursively(current.right, key);
        }
        return current;
    }

    private int getSizeRecursively(BinaryNode<K> current) {
        if (current == null)
            return 0;
        else {
            return 1 + this.getSizeRecursively(current.left)
                    + this.getSizeRecursively(current.right);
        }
    }

    private int searchKeyRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return 0;
        else if (current.key==key)
            return 1;
        else if(key.compareTo(current.key)<0)
            return searchKeyRecursively(current.left,key);
        else if(key.compareTo(current.key)>0)
            return searchKeyRecursively(current.right,key);
        return 0;
    }


}

