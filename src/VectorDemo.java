/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args)
    {
            Vector v = new Vector();
            System.out.println("is Empty :"+v.isEmpty());
            v.add("a");
            v.add("b");
            v.add("a");
            v.add(5);
            v.add(6);
            v.add(null);
            v.add(null);
            v.add(null);
            v.add("c");

    System.out.println(" size :"+v.size());
    System.out.println(" elements : "+v);
    System.out.println("3rd index object : "+v.get(3));
    System.out.println("4th index object : "+v.get(4));
    }
    
}
