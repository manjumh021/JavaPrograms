// Java program to calculate Employee wage for month.

// Calculate Wages till a condition of total working hours or days is reached for
// a month - Assume 100 hours and 20 days


import java.util.Random;
public class WageUsingFunction {
    public static int getEmpHrs(int present){
        int empHrs;
        switch (present) {
            case 2:
                empHrs = 8;
                break;
            case 1:
                empHrs = 4;
                break;
            default :
                empHrs = 0;
            }
            return empHrs;
    }
    public static void main(String[] args) {

        Random random = new Random();
        int wage;
        int empHrs;

        int wagePerHr = 20 ;
        int workingDaysOfMonth = 20;
        int maxWorkingHrs = 100 ;
        int currentDay = 1;
        int totalWage = 0 ;
        int totalHrs = 0;

        while(currentDay<=workingDaysOfMonth && totalHrs < maxWorkingHrs ){
            int present = random.nextInt(3);
            empHrs = getEmpHrs(present);
            wage = wagePerHr * empHrs;
            totalWage += wage;
            currentDay += 1;
            totalHrs += empHrs ;
        }
        if (totalHrs > maxWorkingHrs){
            totalHrs = maxWorkingHrs ;
        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);       
    }
}
