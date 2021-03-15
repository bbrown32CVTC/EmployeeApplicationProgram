package edu.cvtc.java;

// Author: Bruce Brown
// Date: 3/4/2021
// Purpose: Manage the shift supervisor information

import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee {

    // Attributes
    private double annualSalary;
    private double annualBonus;

    // Default Constructor
    public ShiftSupervisor() {
        this.annualSalary = 0.0;
        this.annualBonus = 0.0;
    }

    //Overloaded Constructor
    public ShiftSupervisor(double annualSalary, double annualBonus, String employeeName, String employeeNumber, String hireDate) {

        super(employeeName, employeeNumber, hireDate);

        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    // Methods
    public double getAnnualSalarySalary() {

        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {

        this.annualSalary = annualSalary;
    }

    public double getAnnualBonusBonus() {

        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {

        this.annualBonus = annualBonus;
    }

    @Override
    public String toString() {

        // Decimal formatting object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Set string beginning
        String str = super.toString();

        //Append additional data
        str += "\nAnnual Salary: $" + dollar.format(annualSalary)
                + "\nAnnual Bonus: $" + dollar.format(annualBonus);

        return str;

    }
}

