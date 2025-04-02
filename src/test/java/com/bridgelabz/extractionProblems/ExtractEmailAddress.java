package com.bridgelabz.extractionProblems;

import java.util.regex.*;

public class ExtractEmailAddress {
    public static void extract(String text){
        String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        String text="Contact us at support@example.com and info@company.org";
        extract(text);
    }
}
