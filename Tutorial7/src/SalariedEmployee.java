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

    public SalariedEmployee() {
    }

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "weeklySalary=" + weeklySalary + '}';
    }
    
    @Override
    public double getPaymentAmount()
    {
        return this.weeklySalary;
    }
}


