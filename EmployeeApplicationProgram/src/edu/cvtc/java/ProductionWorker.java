package edu.cvtc.java;

// Author: Bruce Brown
// Date: 3/4/2021
// Purpose: Manage the production worker information

import java.text.DecimalFormat;

public class ProductionWorker extends Employee {

    // Attributes
    private int shift;
    private double hourlyPay;


    //Default Constructor
    public ProductionWorker() {
        this.shift = 0;
        this.hourlyPay = 0.0;
    }

    //Overloaded Constructor
    public ProductionWorker(int shift, double hourlyPay, String employeeName, String employeeNumber, String hireDate) {

        super(employeeName, employeeNumber, hireDate);

        this.shift = shift;
        this.hourlyPay = hourlyPay;
    }

    // Methods
    public int getShift() {

        return shift;
    }

    public void setShift(int shift) {

        this.shift = shift;
    }

    public double getHourlyPay() {

        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {

        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {

        // Decimal formatting object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Set string beginning
        String str = super.toString();

        // Append additional data
        str += "\nShift: ";

        if (shift == 1) {
            str += "Day";
        } else if (shift == 2) {
            str += "Night";
        } else {
            str += "Invalid Shift Number";
        }

        str += "\nHourly Pay: $" + dollar.format(hourlyPay);

        return str;
    }
}

