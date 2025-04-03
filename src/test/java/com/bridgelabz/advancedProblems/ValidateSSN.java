package com.bridgelabz.advancedProblems;

import java.util.Scanner;
import java.util.regex.*;
public class ValidateSSN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = "My SSN is 123-45-6789.";

        String regex = "\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";

        Pattern ssnPattern = Pattern.compile(regex);
        Matcher matchSSN = ssnPattern.matcher(number);

        if (matchSSN.find()) {
            System.out.println(matchSSN.group() + " is a Valid SSN");
        } else {
            System.out.println(number + " is an Invalid SSN");
        }
    }
}
