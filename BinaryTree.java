package com.tarbi;
// Inorder traversal
// pre order traversal
// post order traversal


class Node{

    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    
    }

}


public class BinaryTree {
    
Node root;

public void insert(int data) {
    root=insertRecursion(root, data);

}

public Node insertRecursion(Node root, int data){
    if(root==null){
        root=new Node(data);
}
    else if(data<root.data){
    root.left=insertRecursion(root.left, data);
    }
    else if(data>root.data){
        root.right=insertRecursion(root.right, data);
    }
    return root;
}

// In-order
public void inOrder(){
    inOrderRecursion(root);

}

public void inOrderRecursion(Node root){

    if(root!=null){
        inOrderRecursion(root.left);
        System.out.print(root.data+" ");
        inOrderRecursion(root.right);
        
    }
}

// Post-order
public void postOrder(){
    postOrderRecursion(root);

}

public void postOrderRecursion(Node root){

    if(root!=null){
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data+" ");
        
    }
}

// Pre-Order
public void preOrder(){
    preOrderRecursion(root);

}

public void preOrderRecursion(Node root){

    if(root!=null){
        System.out.print(root.data+" ");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right)
        ;
        
    }
}


}
