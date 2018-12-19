/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class Emp {
    int eno;
    String ename;
    double sal;
    String dept;
    
    Emp(int eno,String ename,double sal,String dept)
    {
            this.eno = eno;
            this.ename = ename;
            this.sal = sal;
            this.dept =   dept;
            
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Emp)
        {
            Emp e = (Emp)obj;
            return(this.eno == eno) && (this.dept.equals(e.dept));
        }
        return false;
    }
}
