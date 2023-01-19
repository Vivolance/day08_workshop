package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {
    LinkedList<String> ll = new LinkedList<String>();
    
    //adding items to a linkedlist
    ll.add("A");
    ll.add("B");
    ll.add("C");
    ll.add("D");
    ll.add("E");
    ll.add("F");
    ll.add("G");

    //print out all items in the linkedlist itm
    ll.forEach(itm -> System.out.println(itm));

    //remove items from linkedlist
    ll.remove("C");
    System.out.println(ll);

    //remove method is inside linkedlist
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);

    }
    
}
