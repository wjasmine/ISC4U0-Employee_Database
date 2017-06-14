/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database;

/* this class is a subclass of the superclass Employee
 * here only contains full time employees
 * these employees have some special attributes, mainly yearly salary
 */
public class FullTimeEmployee extends Employee{
    protected double yearlySalary;
    
    //this is the constructure so an object of type full time employee can be created
    public FullTimeEmployee (int num, String name, String eGender, double salary, double dRate) {
        employeeNumber = num;
        firstName = name;
        gender = eGender;
        yearlySalary = salary;
        deductionsRate = dRate;
    }
 
}
