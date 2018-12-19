/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class BankAccount {
    double accno;
    String acc_Holdername;
    double balance;
    String branch;
    
    BankAccount(long accno,String acc_Holdername,double balance,String branch)
    {
            this.acc_Holdername = acc_Holdername;
            this.accno = accno;
            this.balance = balance;
            this.branch = branch;
            
            
    }
    @Override
    public boolean equals(Object obj)
    {
            if(obj instanceof BankAccount)
            {
                    BankAccount b = (BankAccount)obj;
                    return(this.accno = b.accno) && (this.branch.equals(b.branch));
            }
            return false;
        }
}



















