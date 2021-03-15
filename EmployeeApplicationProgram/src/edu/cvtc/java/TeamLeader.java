package edu.cvtc.java;

// Author: Bruce Brown
// Date: 3/4/2021
// Purpose: Manage the team leader information

import java.text.DecimalFormat;

public class TeamLeader extends ProductionWorker {

    // Attributes
    private double monthlyBonus;
    private double reqTrainHours;
    private double attTrainHours;


    // Default Constructor
    public TeamLeader() {
        this.monthlyBonus = 0.0;
        this.reqTrainHours = 0;
        this.attTrainHours = 0;
    }

    // Overloaded Constructor
    public TeamLeader(double monthlyBonus, double reqTrainHours, double attTrainHours, int shift, double hourlyPay, String employeeName, String employeeNumber, String hireDate) {

        super(shift, hourlyPay, employeeName, employeeNumber, hireDate);

        this.monthlyBonus = monthlyBonus;
        this.reqTrainHours = reqTrainHours;
        this.attTrainHours = attTrainHours;
    }


    // Methods
    public double getMonthlyBonus() {

        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {

        this.monthlyBonus = monthlyBonus;
    }

    public double getReqTrainHours() {

        return reqTrainHours;
    }

    public void setReqTrainHours(double reqTrainHours) {

        this.reqTrainHours = reqTrainHours;
    }

    public double getAttTrainHours() {

        return attTrainHours;
    }

    public void setAttTrainHours(double attTrainHours) {

        this.attTrainHours = attTrainHours;
    }


    @Override
    public String toString() {

        // Decimal formatting object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Set string beginning
        String str = super.toString();

        //Add additional data
        str += "\nMonthly Bonus: $" + dollar.format(monthlyBonus)
                + "\nRequired Training Hours: " + reqTrainHours
                + "\nAttended Training Hours: " + attTrainHours;

        return str;
    }
}

