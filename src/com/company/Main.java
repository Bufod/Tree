package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 6, 4, 80, 1};
        BinaryTree tree = new BinaryTree(arr[0]);
        // добавление остальных элементов в дерево
        for(int i = 1; i < arr.length; i++){
            tree.insertNode(tree, arr[i]);
        }
        tree.printLeftTree(tree, 0);
        System.out.println();
        tree.printRightTree(tree, 0);
    }
}
