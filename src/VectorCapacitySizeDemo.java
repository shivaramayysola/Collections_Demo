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
class Address
{
    String hsno,street,city,ph;
    Address(String hsno,String street,String city,String ph)
    {
        this.hsno = hsno;
        this.street = street;
        this.city = city;
        
    }
}
//////////////////////
class Customer
{
    String name;
    int Age;
    Address address;
    Customer(String name,int Age,Address address)
    {
            this.name = name;
            this.Age = Age;
            this.address = address;
            
            public String toString()
            return(     "Name : "+ name +"\nAge :"+ age + 
                        "\nH.No :" +address.hsno+"\nStreet :"+address.street+
                        "\nCity" +address.city+"\n ph"+address.ph
                        
            );
                
            
                
    }


////////////////////////////////////////
public class VectorCapacitySizeDemo {
    public static void main(String[] args)
    {
            Vector v = new Vector(3);
            System.out.println("Initial Capacity and Size of Vector is..");
            System.out.println("capacity : " +v.capacity());
            System.out.println("Size : "+v.size());
            
            System.out.println();
            
            Customer c1 = new Customer("Newton",30 ,new Address("1-125/1/2","Vizag","Andhra","12345"));
            Customer c2 = new Customer("Einstein",40 ,new Address("2-125/2/3","VIjayawada","Andhrapradesh","132123"));    
           Customer c3 = new Customer("Dhoni",50 ,new Address("1-125/4/5","Jharkand","MP","12345321"));
           Customer c4 = new Customer("Laxman",70 ,new Address("1-123/6/88","Kakinada","AP","1412345"));    
            Customer c5 = new Customer("Yuvi",80 ,new Address("1-125/88/9","Jodhpur","Punjab","1234455"));
                Customer c6 = new Customer("ganguly",90 ,new Address("1-125/3/2","shapur","tamilnadu","1244345"));
             Customer c7 = new Customer("Bhaji",34 ,new Address("1-125/4/3","Ongole","Andhra","12345"));
           
           v.add(c1);
           v.add(c2);
           
           System.out.println("Reached its capacity........or not?");
           System.out.println("capacity :"+v.capacity());
           System.out.println("Size :"+v.size());
                   System.out.println();
                   
            v.add(c3);
           System.out.println("Reached its capacity.........or not?");
           System.out.println("capacity :"+v.capacity());
            System.out.println("size :"+ v.size());
           System.out.println();

            v.add(c4);
           
           System.out.println("Reached its capacity........or not?");
           System.out.println("capacity :"+v.capacity());
           System.out.println("Size :"+v.size());
                   System.out.println();
   
                              
        v.add(c5);
           v.add(c6);
           
           System.out.println("Reached its capacity........or not?");
           System.out.println("capacity :"+v.capacity());
           System.out.println("Size :"+v.size());
                   System.out.println();
   
          v.add(c7);
           
           
           System.out.println("Reached its capacity........or not?");
           System.out.println("capacity :"+v.capacity());
           System.out.println("Size :"+v.size());
                   System.out.println();
   
          System.out.println("The customer labels are");
                            System.out.println();
                            
            for(int i=0; i<v.size() ;i++)
            {   
                System.out.println(v.get(i));
                System.out.println();
   
            }
                
    
       }

}