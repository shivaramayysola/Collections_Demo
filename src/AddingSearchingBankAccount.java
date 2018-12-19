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
public class AddingSearchingBankAccount {
    
    public static void main(String[] args)
    {
            ArrayList al = new ArrayList();
            
            al.add(new BankAccount(324501,"Shiva",2000,"india"));
            al.add(new BankAccount(324502,"ram",3000,"indonesia"));
            al.add(new BankAccount(324503,"sai",5000,"newyork"));
System.out.println(al.contains(new BankAccount(324501,"Shiva",2000,"india")));
System.out.println(al.contains(new BankAccount(324501,"venkata",6000,"spain")));
            
            
    }
}
