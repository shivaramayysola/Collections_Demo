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
public class Removing_Int_Obj {
    public static void main(String[] args)
    {
            ArrayList al  = new ArrayList();
            al.add("5");
            al.add(5);
            al.add(6);
            al.add(7);
            al.add(8);
            al.add(9);
            al.add(10);
            al.add(12);
            al.add(1);
            al.add(2);
            al.add(3);
            
           System.out.println(al);
           al.remove(5);
           al.remove(10);
           System.out.println(al);
           al.remove(new Integer(5));
    
    
    
    
    
    
    
    }
}
