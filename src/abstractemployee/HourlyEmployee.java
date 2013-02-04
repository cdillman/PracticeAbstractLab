/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractemployee;

/**
 *
 * @author Corbin
 */
public class HourlyEmployee extends Employee{

    private double hourlyWage;
    private double hoursWorked;
    
    @Override
    public double getAnnualWages() {
        return hourlyWage * hoursWorked;
        
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
}
