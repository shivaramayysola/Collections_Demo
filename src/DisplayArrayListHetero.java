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
public class DisplayArrayListHetero {
    
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("Shiva");
        al.add(2000);
        
        al.add("Ram");
        al.add(3000);
        
        al.add("venkata");
        al.add(4000);
        
        System.out.println(al);
        
        System.out.println();
        System.out.println("Name Sal");
        System.out.println("=========");
      
        for(int i=0; i<al.size(); i++)
        {
                Object  ele = al.get(i);
        }    
        if(ele instanceof String)
        {
                String name = (String)ele;
                System.out.println(name.toUpperCase()+"S");
                
        }
        else
        {
                System.out.println(ele);
        }
            
            
    }
}
