package com.bridgelabz.basicRegexProblems;

import java.util.regex.*;

public class ValidateHexCode {
    public static boolean isValidate(String code){
        String regex="^#[0-9A-Fa-f]{6}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(code);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidate("#FFA500"));
        System.out.println(isValidate("#ff4500"));
        System.out.println(isValidate("#123"));
    }
}
