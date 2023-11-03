package com.bridgeLabz;

public class EmployeeWageProblem {

    // Constant instance variable
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxPerHourPerMonth){
        // Local variables
        int empHrs, totalEmpHrs = 0, totalWorkingDays=0;

        // Logic of employee wage computation for multi company
        while (totalEmpHrs <= maxPerHourPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random()*10)%3);
            switch (empCheck){
                case IS_PART_TIME:
                    empHrs  =4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days : "+totalWorkingDays+" Emp hrs : "+empHrs );
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for company : "+company+" is : "+totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {

        computeEmpWage("DMart",20, 2, 100);
        computeEmpWage("TATA", 30, 4, 80);
    }
}
