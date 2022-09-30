// Java program to calculate Employee wage

import java.util.Random;
public class EmployeeDailyWage {
    public static void main(String[] args) {
        Random random = new Random();
        int wagePerHr = 20 ;
        int manHrPerDay = 8 ;
        boolean present = random.nextBoolean();
        if (present){
            int wage = wagePerHr * manHrPerDay ;
            System.out.println("Employee is present and his wage is : " + wage);
        }
        else{
            System.out.println("Employee is absent and his wage is 0.");
        }
    }
}