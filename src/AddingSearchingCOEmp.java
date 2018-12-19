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
public class AddingSearchingCOEmp {
    
    public static void main(String[] args)
    {
                ArrayList al = new ArrayList();
                al.add(new Emp(101,"Shiva",1000,"java"));
                     al.add(new Emp(102,"Ram",2000,"Adv java"));
                al.add(new Emp(103,"Venkata",3000,"spring"));
                
                System.out.println(al.contains(new Emp(101,"Shiva",1000,"java")));
                System.out.println(al.contains(new Emp(101,"sai",1000,"java")));
               
           
    }
}
