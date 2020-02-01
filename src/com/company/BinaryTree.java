package com.company;

public class BinaryTree {
    int value; //Значение узла
    BinaryTree lchild; // левый потомок
    BinaryTree rchild; // правый потомок

    public BinaryTree(int value) {
        this.value = value;
        this.lchild = null;
        this.rchild = null;
    }

    // метод вставки элементов в дерево
    public BinaryTree insertNode(BinaryTree node, int targetValue){
        // создается дерево если структуры нет
        if (node == null){
            node = new BinaryTree(targetValue);
            return node;
        }

        // если значение в узле больше значения элемента
        // уходим влево
        if (node.value > targetValue){
            // если левого потомка не существует - создаем его
            if (node.lchild == null)
                return node.lchild = new BinaryTree(targetValue);
            // если левый потомок существует передаем ему управление
            // на вставку элемента
            else
                return insertNode(node.lchild, targetValue);
        }
        // движение вправо если значение элемента больше значения узла
        else if (node.value < targetValue){
            // если правого потомка не существует - создаем
            if (node.rchild == null)
                return node.rchild = new BinaryTree(targetValue);
            // если существует передаем управление правому поддереву
            else
                return insertNode(node.rchild, targetValue);
        }
        // значения совпали
        return null;
    }

    // вывод дерева на экран
    public void printLeftTree(BinaryTree node, int level){
        if (node != null){
            // Левосторонний обход
            printLeftTree(node.lchild, level+1);
//            for(int i = 0; i < level; i++)
//                System.out.print("   ");
            System.out.println(node.value);
            printLeftTree(node.rchild, level+1);
        }
    }

    // вывод дерева на экран
    public void printRightTree(BinaryTree node, int level){
        if (node != null){
            // Левосторонний обход
            printRightTree(node.rchild, level+1);
//            for(int i = 0; i < level; i++)
//                System.out.print("   ");
            System.out.println(node.value);
            printRightTree(node.lchild, level+1);
        }
    }

}
