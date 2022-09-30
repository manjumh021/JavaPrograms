// Java program to calculate Employee wage for month.

// Calculate Wages till a condition of total working hours or days is reached for
// a month - Assume 100 hours and 20 days


import java.util.Random;
public class WageForMonthUsingSwitchCase {
    public static void main(String[] args) {

        Random random = new Random();
        int wage;

        int wagePerHr = 20 ;
        int fullTimeHrPerDay = 8 ;
        int partTimeHrPerDay = 4 ;
        int workingDaysOfMonth = 20;
        int maxWorkingHrs = 100 ;
        int currentDay = 1;
        int totalWage = 0 ;
        int totalHrs = 0;

        while(currentDay!=workingDaysOfMonth && totalHrs <= maxWorkingHrs ){
            int present = random.nextInt(3);
            switch (present) {
            case 2:
                wage = wagePerHr * fullTimeHrPerDay ;
                totalHrs = totalHrs + fullTimeHrPerDay ; 
                break;
            case 1:
                wage = wagePerHr * partTimeHrPerDay ;
                totalHrs = totalHrs + partTimeHrPerDay ;
                break;
            case 0: // This can be redundant but for understanding purpose I have added
                wage = wagePerHr * 0 ;
                break;
            default :
                wage = 0 ;
            }
            totalWage =  totalWage + wage;
            currentDay += 1;
        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);       
    }
}
