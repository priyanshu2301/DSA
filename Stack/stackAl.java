/**
    Implementing stack using ArrayList
*/

import java.util.*;

class stackAl{

    static class stack {
            static ArrayList<Integer> list = new ArrayList<>();

            public static boolean isEmpty(){
                return list.size() == 0;
            }

            public static void push(int data){
                list.add(data);
            }

            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = list.remove(list.size() - 1); //getting the top pointer from stack
                return top;
            }

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return list.get(list.size() - 1); // returning top element of stack
            }
        }

    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(stack.isEmpty() != true){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}