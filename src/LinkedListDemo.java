/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args)
    {
            LinkedList ll = new LinkedList();
            ll.add("a");
            ll.add("c");
            ll.add("d");
            ll.add(1,"b");
            ll.add(4,"e");
            System.out.println(ll);
    }
    
}
