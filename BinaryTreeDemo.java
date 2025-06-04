package com.tarbi;
public class BinaryTreeDemo {
    public static void main(String[] args) {
    BinaryTree tree=new BinaryTree();
    
    tree.insert(4);
    tree.insert(5);
    tree.insert(6);
    tree.insert(20);
    tree.insert(1);
    tree.insert(40);
    tree.insert(422);

    tree.inOrder();
    System.out.println();
    tree.preOrder();
    System.out.println();
    tree.postOrder();
    
    
    
    
        }
}
