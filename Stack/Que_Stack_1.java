/**
Question : Push data at the bottom of the stack
*/
import java.util.*;

class Que_stack_1{

    // check if stack is empty
    public static boolean isEmpty(Stack<Integer> s){
        return s.size() == 0;
    }

    //to push at bottom (using recursion)
    public static void pushAtBotton(Stack<Integer> s, int data){
        if(isEmpty(s)){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBotton(s, data);
        s.push(temp);
    }

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBotton(stack, 4);

        while(stack.isEmpty() != true){
            System.out.println(stack.pop());
        }
    }
}