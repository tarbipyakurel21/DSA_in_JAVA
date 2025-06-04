

public class Queue {
    private int size;
   private int front;
   private int rear;
   private int[] arr;
private int maxSize;

   public Queue(){
    front=0;
    rear=-1;
    size=0; 
    maxSize=4;
    arr=new int[maxSize];
}
    
public boolean isFull(){
    return size==4;
}

public boolean isEmpty(){
    return size==0;
}
 
public void enqueue(int data) {
    if(!isFull()){
        rear=(rear+1)%maxSize;
        arr[rear]=data;
        size++;
    }
    else{
        System.out.println("queue is full");
    }
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int data=arr[front];
        front=(front+1)%maxSize ;
        size--;
        return data;
    }

    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
    return arr[front];
        }

    public void printQueue(){
        for (int i=front;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
