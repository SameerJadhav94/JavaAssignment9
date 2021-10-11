package com.company.assignmentnine;

import java.util.concurrent.ThreadLocalRandom;

class Companies{
    //Constants
    final int FullTime=1;
    final int PartTime=2;

    //Variables
    int	WagePerHr;
    int	WorkingDays;
    int WorkingHrsPerMonth;

    public Companies(int wagePerHr, int workingDays, int workingHrsPerMonth) {
        WagePerHr = wagePerHr;
        WorkingDays = workingDays;
        WorkingHrsPerMonth = workingHrsPerMonth;
    }

    //Initializers
    int	salary=0;
    int	Total_hrs=0;
    int emphrs=0;
    public int getEmpWage() {
        for (int days = 1, empHrs = 1; days <= WorkingDays && empHrs <= WorkingHrsPerMonth; days++, empHrs++) {
            int EmployCheck = ThreadLocalRandom.current().nextInt(0, 3);
            if (EmployCheck == FullTime) {
                emphrs = 8;
            } else if (EmployCheck == PartTime) {
                emphrs = 4;
            } else {
                emphrs = 0;
            }
            Total_hrs = (Total_hrs + emphrs);
            int Emp_Wages = (emphrs * WagePerHr);
            salary = (salary + Emp_Wages);
        }
        return salary;
    }
}

public class WagesForMultipleCompanies {
    public static void main(String[] args) {
        Companies Google = new Companies(50, 22, 132);
        Companies Accenture = new Companies(25, 20, 125 );
        System.out.println("Employee Salary for the Month:- " + Google.getEmpWage());
        System.out.println("Employee Salary for the Month:- " + Accenture.getEmpWage());
    }
}
