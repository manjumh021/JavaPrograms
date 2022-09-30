// Java program to Check Employee is Present or Absent

import java.util.Random;
public class AttendanceCheck {
    public static void main(String[] args) {
        Random random = new Random(); 
        boolean present = random.nextBoolean();
        if (present){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent.");
        }
    }
}