//implementing simple linked list using java collections framewrok

import java.util.*;

class Simple_LL{

    public static void main(String args[]){
        
        //created a Linked List
        LinkedList<String> list = new LinkedList<String>();

        //add first
        list.addFirst("Gates");
        list.addFirst("Jobs");

        //add last
        list.addLast("Musk");
        list.addLast("Zuck");

        //print List
        //Traversing through List
        System.out.println("added elements: ");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + "->");
        }

        //remove from front
        list.removeFirst();

        //remove from last
        list.removeLast();

        //remove using index
        list.remove(0);

        //print list (traversing)
        System.out.println("elements after removed : ");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + "->");
        }

        //size of list
        System.out.println("List size : " + list.size());
    }

}