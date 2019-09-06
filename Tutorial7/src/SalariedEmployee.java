/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12095732
 */
public class SalariedEmployee implements Payable{
    
    double weeklySalary; 
    String name;
    String lastname;
    String Abc;

    public SalariedEmployee(String name, String lastname, String Abc,double weeklySalary) {
        this.weeklySalary = weeklySalary;
        this.name = name;
        this.lastname = lastname;
        this.Abc = Abc;
    }

    public SalariedEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAbc() {
        return Abc;
    }

    public void setAbc(String Abc) {
        this.Abc = Abc;
    }

   
    

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "weeklySalary=" + weeklySalary + ", name=" + name + ", lastname=" + lastname + ", Abc=" + Abc + '}';
    }

    
    
    @Override
    public double getPaymentAmount()
    {
        return this.weeklySalary;
    }
}


