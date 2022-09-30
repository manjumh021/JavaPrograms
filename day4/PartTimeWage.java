// Java program to calculate Employee wage considering part time also.

import java.util.Random;

public class PartTimeWage {
    public static void main(String[] args) {
        Random random = new Random();
        int wagePerHr = 20 ;
        int manHrPerDay = 8 ;
        int partTimeHr = 4 ;
        int present = random.nextInt(3);
        if (present==2){
            int wage = wagePerHr * manHrPerDay ;
            System.out.println("Employee is full time present and his wage is : " + wage);
        }
        else if (present==1){
            int wage = wagePerHr * partTimeHr ;
            System.out.println("Employee is part time present and his wage is : " + wage);
        }
        else{
            System.out.println("Employee is absent and his wage is 0.");
        }
    }
}