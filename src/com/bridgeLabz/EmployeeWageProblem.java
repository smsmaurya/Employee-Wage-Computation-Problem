package com.bridgeLabz;

public class EmployeeWageProblem {

    // Constant instance variable
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxPerHourPerMonth;
    private int totalEmpWage;

    public EmployeeWageProblem(String company, int empRatePerHour, int numOfWorkingDays, int maxPerHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxPerHourPerMonth = maxPerHourPerMonth;
    }

    public void computeEmpWage(){
        // Local variables
        int empHrs, totalEmpHrs = 0, totalWorkingDays=0;

        // Logic of employee wage computation
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
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for company : "+company+" is : "+totalEmpWage;
    }

    public static void main(String[] args) {

        EmployeeWageProblem dMart = new EmployeeWageProblem("DMart",20, 2, 100);
        EmployeeWageProblem reliance = new EmployeeWageProblem("Reliance",30, 4, 80);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
