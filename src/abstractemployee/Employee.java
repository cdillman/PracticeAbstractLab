/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractemployee;

import javax.swing.JOptionPane;

/**
 *
 * @author Corbin
 */
public abstract class Employee {
    private String lastName;
    private String firstName;
    
    
    public abstract double getAnnualWages();
    
    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
       if (lastName == null || lastName.length() == 0){
           JOptionPane.showMessageDialog(null, "Error: Last name cannot be null or empty");
           System.exit(0);
       }
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if(lastName == null || lastName.length() == 0){
            JOptionPane.showMessageDialog(null, "Error: First name cannot be null or empty");
            System.exit(0);
        }
        this.firstName = firstName;
    }
   
}
