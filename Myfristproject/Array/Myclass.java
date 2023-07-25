package Myfristproject.Array;

import java.util.Stack;

public class Myclass {
public static void main(String[] args) {
    Stack<Integer> even  = new Stack<>();
         even.push(10);
          even.push(410);
           even.push(220);
             even.push(100);
     System.out.println(even);

     System.out.println(even.pop());
     System.out.println(even.pop());
     System.out.println(even.pop());
     System.out.println(even.pop());
              


     System.out.println(even.peek ());
         //System.out.println(even.search (100));
         System.out.println("Number on top of the stack is => " + even.peek());
        


}
    
}
