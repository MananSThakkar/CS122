


import java.util.LinkedList;

public class LinkedListExample  {
 
    public static void main(String a[]){
         
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
       
    }
}
