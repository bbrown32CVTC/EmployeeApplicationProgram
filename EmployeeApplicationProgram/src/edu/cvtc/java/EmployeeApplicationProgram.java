package edu.cvtc.java;

// Author: Bruce Brown
// Date: 3/7/2021
// Purpose: Program to test the classes

public class EmployeeApplicationProgram {

    public static void main(String[] args) {

        // Declare Objects
        ProductionWorker productionWorkerCall;
        ProductionWorker productionWorkerSet;
        ShiftSupervisor shiftSupervisorCall;
        ShiftSupervisor shiftSupervisorSet;
        TeamLeader teamLeaderCall;
        TeamLeader teamLeaderSet;

        // Assign Objects
        productionWorkerCall = new ProductionWorker(1, 16.5, "John Smith", "123-A", "11-15-2005");
        productionWorkerSet = new ProductionWorker();
        productionWorkerSet.setShift(2);
        productionWorkerSet.setHourlyPay(18.5);
        productionWorkerSet.setEmployeeName("Joan Jones");
        productionWorkerSet.setEmployeeNumber("222-P");
        productionWorkerSet.setHireDate("12-12-2005");

        shiftSupervisorCall = new ShiftSupervisor(48000.0, 6500.0, "John Smith", "123-A", "11-15-2005");
        shiftSupervisorSet = new ShiftSupervisor();
        shiftSupervisorSet.setAnnualSalary(55000.0);
        shiftSupervisorSet.setAnnualBonus(8000.0);
        shiftSupervisorSet.setEmployeeName("Joan Jones");
        shiftSupervisorSet.setEmployeeNumber("222-L");
        shiftSupervisorSet.setHireDate("12-12-2005");

        teamLeaderCall = new TeamLeader(500.0, 5.0, 2.5, 1, 16.5, "John Smith", "123-A", "11-15-2005");
        teamLeaderSet = new TeamLeader();
        teamLeaderSet.setMonthlyBonus(600.0);
        teamLeaderSet.setReqTrainHours(7.0);
        teamLeaderSet.setAttTrainHours(3.5);
        teamLeaderSet.setShift(2);
        teamLeaderSet.setHourlyPay(18.5);
        teamLeaderSet.setEmployeeName("Joan Jones");
        teamLeaderSet.setEmployeeNumber("222-L");
        teamLeaderSet.setHireDate("12-12-2005");

        // Displays data for the ProductionWorker class instance
        System.out.println("Production Worker - Data Passed In");
        System.out.println(productionWorkerCall);
        System.out.println();

        System.out.println("Production Worker - Data Set");
        System.out.println(productionWorkerSet);
        System.out.println();

        // Displays data for the Supervisor class instance
        System.out.println("Shift Supervisor - Data Passed In");
        System.out.println(shiftSupervisorCall);
        System.out.println();

        System.out.println("Shift Supervisor - Data Set");
        System.out.println(shiftSupervisorSet);
        System.out.println();

        // Displays data for the TeamLeader class instance
        System.out.println("Team Leader - Data Passed In");
        System.out.println(teamLeaderCall);
        System.out.println();

        System.out.println("Team Leader - Data Set");
        System.out.println(teamLeaderSet);
        System.out.println();


    }

}
