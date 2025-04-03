package com.bridgelabz.advancedProblems;

import java.util.regex.*;

public class ValidateIP {
    public static void main(String[] args) {
        String text="127.0.0.1";
        String regex="[0-255]+.[0.255]+.[0-255]+.[0-255]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
