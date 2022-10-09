// Java program to calculate Employee wage for month.

// Calculate Wages till a condition of total working hours or days is reached for
// a month - Assume 100 hours and 20 days


import java.util.Random;

public class WageForMonthUsingClass {
    public static void main(String[] args) {

        Random random = new Random();
        EmployeeWage empWage = new EmployeeWage();

        int currentDay = 1;
        int totalHrs = 0;
        int totalWage = 0;
        int hoursOfCurrentDay;
        int wage;

        while(empWage.checkCondition(currentDay,totalHrs)){
            int present = random.nextInt(3);
            hoursOfCurrentDay = empWage.getEmployeeHrs(present);
            wage = empWage.getEmployeeWageOfDay(hoursOfCurrentDay);
            totalHrs = totalHrs + hoursOfCurrentDay;
            totalWage =  totalWage + wage;
            currentDay += 1;
        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);       
    }
}

public class EmployeeWage{

    public int fullTimeHrPerDay;
    public int partTimeHrPerDay;
    public int wagePerHr;
    public int workingDaysOfMonth;
    public int maxWorkingHrs;

    EmployeeWage(){
        fullTimeHrPerDay = 8 ;
        partTimeHrPerDay = 4 ;
        wagePerHr = 20 ;
        workingDaysOfMonth = 20;
        maxWorkingHrs = 100 ;
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
    public boolean checkCondition(int currentDay, int totalHrs){
        if (currentDay!=this.workingDaysOfMonth && totalHrs <= maxWorkingHrs){
            return true;
        }
        else{
            return false;
        }

    }
}
