package edu.cvtc.java;

// Author: Bruce Brown
// Date: 3/4/2021
// Purpose: Manage the employee information

public class Employee {

    // Attributes
    private String employeeName;
    private String employeeNumber;
    private String hireDate;


    // Default Constructor
    public Employee () {
        this.employeeName = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }


    // Overloaded Constructor
    public Employee (String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;

    }


    // Methods
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {

        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isValidEmployeeNumber(String employeeNumber) {

        boolean goodSoFar = true;

        // Verifies the string is 5 characters long
        if (employeeNumber.length() != 5) {
            goodSoFar = false;

        } else {

            // Verifies characters are correct
            if (!Character.isDigit(employeeNumber.charAt(0)) || !Character.isDigit(employeeNumber.charAt(1)) || !Character.isDigit(employeeNumber.charAt(2)) || employeeNumber.charAt(3) != '-' || Character.getNumericValue(employeeNumber.charAt(4)) < 10 || Character.getNumericValue(employeeNumber.charAt(4)) > 22) {
                goodSoFar = false;
            }

        }

        return goodSoFar;

    }

    @Override
    public String toString() {

        String str = "Name: " + employeeName + "\nEmployee Number: ";
        if (!isValidEmployeeNumber(employeeNumber)) {
            str += "Invalid Employee Number!";
        } else {
            str += employeeNumber;
        }
        str += "\nHire Date: " + hireDate;

        return str;
    }
}
