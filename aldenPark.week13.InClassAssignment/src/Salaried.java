/**
 * @filename: Salaried.java
 * @author: Alden Park
 * @date: 11/21/2017
 * @description: Week 13 in Class Assignment
 */

/**
 * This class implements a salaried employee
 */
public class Salaried extends Employee {
    private double salary;              // per year
    
    public Salaried(String name, double salary)
    {
        super(name);
        this.salary = salary;
    } // end constructor
    
    @Override
    public double getPay()
    {
        return this.salary / 24;        // per half month
    } // end getPay
} // end class Salaried
