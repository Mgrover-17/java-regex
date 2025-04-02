package com.bridgelabz.basicRegexProblems;

import java.util.regex.*;

public class ValidateLicensePlateNumber {
    public static boolean isValidate(String number){
        String regex= "^[A-Z]{2}\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(number);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidate("AB1234")); //VALID
        System.out.println(isValidate("A12345")); //invalid
    }
}
