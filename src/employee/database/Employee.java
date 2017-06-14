/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database;

/* this class is the superclass of the employee types
 * it contains attributes common to both full time and part time employees
 * this includes, employee number, name, gender, and deductions rate
 * all these variables are protected so subclasses can access it yet still be secure
 */

public abstract class Employee{
    protected int employeeNumber;
    protected String firstName;
    protected String gender;
    protected double deductionsRate;
}

//DO YOU PUT CONSTRUCTURE HERE????
