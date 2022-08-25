//reverse linked list
// using java collections framework

import java.util.*;

class reverse_LL {
    public static void main(String args[]){
        
        //created a Linked List
        LinkedList<Integer> list = new LinkedList<Integer>();

        //add first
        list.addFirst(1);
        list.addFirst(2);

        //add last
        list.addLast(3);
        list.addLast(4);

        //print List
        //Traversing through List
        System.out.println("added elements: ");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + "->");
        }

        //reverse 
        Collections.reverse(list);

        //print after reverse
        System.out.println("after reverse elements: ");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + "->");
        }
    }
}
