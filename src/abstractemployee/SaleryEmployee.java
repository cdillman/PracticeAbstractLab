/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractemployee;

/**
 *
 * @author Corbin
 */
public class SaleryEmployee extends Employee{
    
    private double annualSalery;
    
    @Override
    public double getAnnualWages() {
        return annualSalery;
    }

    public double getAnnualSalery() {
        return annualSalery;
    }

    public void setAnnualSalery(double annualSalery) {
        this.annualSalery = annualSalery;
    }
    
}
