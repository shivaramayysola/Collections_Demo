/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
import java.util.Stack;
public class StackDemo {
    
        public static void main(String[] args)
        {
                Stack s = new Stack();
                s.push("a");
                s.push("b");
                s.push("c");
                s.push("d");
                s.push("e");
                s.push("f");
                s.push("g");
                System.out.println(s);
               //retreiving and removing top item
               
               System.out.println(s.pop());
               System.out.println(s);
               
               System.out.println(s.pop());
               System.out.println(s);
               
               System.out.println(s.pop());
               System.out.println();
               
               //only retreiving top item
               System.out.println(s.peek());
               System.out.println(s);
               
               System.out.println(s.peek());
               System.out.println(s);
               System.out.println();
               
               //searching for a item
               
               System.out.println(s.search("b"));
               System.out.println(s.search("e"));
               System.out.println(s.search("f"));
               
              
                        
        }
    
}
