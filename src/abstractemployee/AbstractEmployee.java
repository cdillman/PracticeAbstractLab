/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractemployee;

/**
 *
 * @author Corbin
 */
public class AbstractEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee person = new HourlyEmployee();
        Employee staff = new SaleryEmployee();
        
        person.setFirstName("Corbin");
        person.setLastName("Dillman");
        
        
        System.out.print(person.getFirstName() + " " +person.getLastName() + " makes $");
    }
}
