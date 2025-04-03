package com.bridgelabz.basicRegexProblems;

import java.util.regex.*;

public class ValidateUsername {
    public static boolean isValidUsername(String username){
        String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(username);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println(isValidUsername("Man_vi17"));
        System.out.println(isValidUsername("man"));
    }
}
