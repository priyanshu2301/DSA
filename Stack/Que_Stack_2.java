/**
Question : reverse the Stack 
*/

import java.util.*;

class Que_Stack_2{

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);
        
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void pushAtBotton(Stack<Integer> s, int data){
        if(isEmpty(s)){
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBotton(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Integer> s){
        if(isEmpty(s)){
            return;
        }

        int temp = s.pop();
        reverse(s);
        pushAtBotton(s, temp);
    }

    public static boolean isEmpty(Stack<Integer> s){
        return s.size() == 0;
    }
}