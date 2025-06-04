public class QueueDemo {
    
     public static void main(String[] args) {
        
        Queue queue=new Queue();


        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(90);
   
        System.out.println(queue.dequeue());
        
        queue.enqueue(80);
        queue.enqueue(1);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
       
      System.out.println(queue.peek());
     }
}
