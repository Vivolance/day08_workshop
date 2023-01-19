package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;


public class StackExample {
    public void example() {
        Stack<Integer> stack = new Stack<Integer>();

        //pushing or putting something onto the stack (FILO, LIFO):
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        //pop or taking something from the stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (pop): " + stackItem);
        }

        //see what is the last item on top of the stack (peek):
        Integer peekItem = stack.peek();
        System.out.println("Item on top of stack is: " + peekItem);

        //find bottom most element
        Integer firstItem = stack.firstElement();
        System.out.println("First element of stack: " + firstItem);
        
        //Search for elements from top of stack
        Integer idxElement = stack.search(2);
        System.out.println("Stack element found at index: " + idxElement);

        //iterating through a stack, from the bottom
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }

    }
    
}
