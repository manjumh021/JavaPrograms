package Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexUtility {
    public static void message(String fullname, String mobile) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String firstName = fullname.substring(0, fullname.indexOf(' '));
        String str = "Hello <<name>>, We have your full name\r\n"
                + "as <<fullname>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\r\n"
                + "know in case of any clarification Thank you BridgeLabz Date.";
        String str1 = str.replaceAll("<<name>>", firstName);
        String str2 = str1.replaceAll("<<fullname>>", fullname);
        String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
        String str4 = str3.replaceAll("Date", dateFormat.format(date));

        System.out.println(str4);
    }

    public boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        // TODO Auto-generated method stub ^(.+)@(.+)$
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidMobile(String phone) {
        // TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    public boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public boolean isValidUsername(String userid) {
        // TODO Auto-generated method stub a-zA-Z0-9
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(userid);
        return matcher.matches();
    }

    public boolean isValidPassword(String password) {

        Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

