// Java program to calculate Employee wage for month.

// Calculate Wages till a condition of total working hours or days is reached for
// a month - Assume 100 hours and 20 days


import java.util.Random;
import java.util.Scanner;

public class WageOfCompanies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] companyList             = {"Bridge Labz","Reliance","Dmart","BookMyShow","PayTM"};
        int[] fullTimeHrPerDayList       = {      8,          9,       10,        11,        12  };
        int[] partTimeHrPerDayList       = {      4,          5,        5,         6,         6  };
        int[] wagePerHrList              = {     20,         22,       24,        18,        25  };
        int[] workingDaysOfMonthList     = {     20,         21,       19,        22,        18  };
        int[] maxWorkingHrsList          = {    100,        120,      125,       110,       140  };
        EmployeeWageOfCompany[] company = new EmployeeWageOfCompany[5];
        for(int i=0;i<companyList.length;i++){
            company[i] = new EmployeeWageOfCompany(companyList[i],fullTimeHrPerDayList[i],
                                                partTimeHrPerDayList[i],wagePerHrList[i],
                                                workingDaysOfMonthList[i],maxWorkingHrsList[i]);
            company[i].getTotalWage();
        }
    }
}

public class EmployeeWageOfCompany{

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public String companyName;
    public int fullTimeHrPerDay;
    public int partTimeHrPerDay;
    public int wagePerHr;
    public int workingDaysOfMonth;
    public int maxWorkingHrs;

    EmployeeWageOfCompany(String companyName, int ...arr){
        this.companyName = companyName ;
        this.fullTimeHrPerDay = arr[0] ;
        this.partTimeHrPerDay = arr[1] ;
        this.wagePerHr = arr[2] ;
        this.workingDaysOfMonth = arr[3];
        this.maxWorkingHrs = arr[4] ;
    }
    
        
    public int getEmployeeHrs(int present){
        switch (present) {
            case 2:
                return fullTimeHrPerDay ;
            case 1:
                return partTimeHrPerDay ;
            default :
                return 0 ;
            }
    }
    public int getEmployeeWageOfDay(int hours){
        return  wagePerHr * hours ;
    }

    public void getTotalWage(){
        int currentDay = 1;
        int totalHrs = 0;
        int totalWage = 0;
        int hoursOfCurrentDay;
        int wage;

        while(currentDay<=this.workingDaysOfMonth && totalHrs <= this.maxWorkingHrs){
            int present = random.nextInt(3);
            hoursOfCurrentDay = this.getEmployeeHrs(present);
            wage = this.getEmployeeWageOfDay(hoursOfCurrentDay);
            totalHrs = totalHrs + hoursOfCurrentDay;
            totalWage =  totalWage + wage;
            currentDay += 1;
        }
        System.out.println("companyName : " + this.companyName);
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage); 
    }
}
