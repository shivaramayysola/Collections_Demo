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
public class Vector_Demo {
    public static void main(String[] args)
    {
            Vector v  = new Vector();
            for(int i=0; i<=9; i++)
            {
                    v.addElement(new Integer(i*10));
            }
            System.out.println("Initial elements : "+v);
            v.removeElementAt(0);
            v.removeElementAt(1);
            System.out.println("Elements after removing : "+v);
            
    }
    
}
