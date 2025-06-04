 class Node {
    
        int data;
        Node next;
        Node prev;
    
    
        public Node(int data){
    
            this.data=data;
            next=null;
    
        }
}

public class LinkedList{

Node head=null;
Node tail=null;


public void add(int data){

Node newNode= new Node(data);
Node current = head;
if(head==null){
head=newNode;
}

else{
    while(current.next!=null){
        current=current.next;
    }
        current.next=newNode;
        newNode.next=null;
     
}

}

public void printValues(){

    Node current=head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
}

public void addFirst(int data){

    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;

}

public Node getNode(int data){
    Node current=head;
    while(current.next!=null && current.next.data!=data){
        current=current.next;
}
return current;

}

public void delete(int data){
    if(head==null) return;

    if (head.data==data){
        head=head.next;
    }
    Node node=getNode(data);

    if(node.next!=null)
    node.next=node.next.next;
}
}



