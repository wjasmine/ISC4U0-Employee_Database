/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.database;

/* this class is a subclass of the superclass Employee
 * this class is used to create an part time employee
 * these employees have more attributes than a simple employee
 * with features such as hourly wage, hours per week, and weeks per year
 */
public class PartTimeEmployee extends Employee{
    protected double hourlyWage;
    protected float hoursPerWeek;
    protected int weeksPerYear;
    
    //constructor to create a part time employee
    public PartTimeEmployee (int num, String name, String eGender, double wage, float hours, int weeks, double dRate)
    {
        employeeNumber = num;
        firstName = name;
        gender = eGender;
        deductionsRate = dRate;
       
        hourlyWage = wage;
        hoursPerWeek = hours;
        weeksPerYear = weeks;
    }
}
