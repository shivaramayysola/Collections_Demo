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
public class ArrayList_Demo {

    public static void main(String[] args)
    {
            //creating an ArrayList
            ArrayList al = new ArrayList();
            System.out.println("Initial size of ArrayList :"+al.size());
            
            //Addding elements to the ArrayList
            al.add("Red");
            al.add("Green");
            al.add("Blue");
            al.add("Pink");
            al.add("Orange");
            
            System.out.println("\n Size of ArrayList after conditions :"+al.size());
            
            //Displaying the ArrayList
            System.out.println("\n Contents of Arraylist after add : "+al);
           
    // Removing 4th index element from the ArrayList
        al.remove(4);
        System.out.println("\n Contents of ArrayList after Remove Index : "+ al);
        
        //Removing Pinh from the Arraylist
        al.remove("Pink");
        System.out.println("\n Content of ArrayList after Remove object : "+ al); 
        System.out.println("\n size of ArrayList after deletions : "+al.size());
        System.out.println();
        
        //retrieving 1st  index element 
        String alElement = (String)(al.get(1));
        System.out.println("alElement: "+alElement);
        
        //inserting at 2nd index
        al.add(2,alElement+" Purple ");
        System.out.println(al);
    }
}
