
public class Stack {

    int top;
    private int[] arr= new int[5];
    int size;

    public Stack(){
        size=arr.length;
        top= -1;
 }


public void push(int data){

    if(top<size){
    arr[++top]=data;
    }

    else{
        System.out.println("Stack Overflow");
    }
}

public int pop(){
if(top>-1){
return arr[top--];
}
else{
    System.out.println("Stack Underflow");
}
return 0;
}

public void printStack(){
    for (int num : arr){
        System.out.print(num+" ");
    }
}

public int peek(){
    return arr[top];

}
}


