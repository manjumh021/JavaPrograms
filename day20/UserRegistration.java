import java.util.Scanner;
import Utility.StringRegexUtility;

public class UserRegistration {
    public static void main(String[] args) {
        StringRegexUtility utility = new StringRegexUtility();
        String fname, lname, email, phone, company, userid, password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName");
        fname = scanner.nextLine();
        if (utility.isValidName(fname)) {
            System.out.println("Enter LastName");
            lname = scanner.nextLine();
            if (utility.isValidName(lname)) {
                System.out.println("Enter Email");
                email = scanner.nextLine();
                if (utility.isValidEmail(email)) {
                    System.out.println("Enter Mobile number with Country Code");
                    phone = scanner.nextLine();
                    if (!phone.isEmpty()) {
                        System.out.println(phone);
                        if (utility.isValidMobile(phone)) {
                            System.out.println("Enter Company Name");
                            company = scanner.nextLine();
                            System.out.println("Enter UserId");
                            userid = scanner.nextLine();
                            if (utility.isValidUsername(userid)) {
                                System.out.println("Enter Password");
                                password = scanner.next();
                                if (utility.isValidPassword(password)) {
                                    System.out.println("Thank you for your time");
                                    System.out.println("Form details are");
                                    System.out.println("FirstName :" + fname);
                                    System.out.println("LastName :" + lname);
                                    System.out.println("Email :" + email);
                                    System.out.println("MobileNumber :" + phone);
                                    System.out.println("CompanyName :" + company);
                                    System.out.println("UserId :" + userid);
                                    System.out.println("Password :" + password);
                                } else
                                    System.out.println("Enter valid Password");
                            } else
                                System.out.println("Enter valid Username");
                        } else
                            System.out.println("Please enter valid Mobile Number");
                    } else
                        System.out.println("Please enter valid Email");
                } else
                    System.out.println("Please enter valid LastName");
            } else
                System.out.println("Please enter valid FirstName");
            scanner.close();
        }
    }
}