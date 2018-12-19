/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        System.out.println("isEmpty :"+ al.isEmpty());
        al.add("a");
        al.add("b");
        al.add(5);
        al.add("a");
        al.add(6);
        al.add(null);
        al.add(null);
        al.add(null);
        System.out.println(" Size : "+al.size());
        System.out.println("elements : "+al);
        
        //retreiving objects randomly
        System.out.println("3rd index object: "+al.get(3));

    }
            
}
