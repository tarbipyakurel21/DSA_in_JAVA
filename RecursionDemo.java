public class RecursionDemo {

public static void main(String[] args) {

int result = factorial(5);
System.out.println(result);

}

public static void f1(int i){
System.out.println(i);
if (i>0)
f1(i-1);
    }


public static int factorial(int i){
   
    if(i!=0){
    return i* factorial(i-1);
    }

    return 1;
   
}
    
}
 