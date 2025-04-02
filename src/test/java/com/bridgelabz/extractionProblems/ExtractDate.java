package com.bridgelabz.extractionProblems;

import java.util.regex.*;

public class ExtractDate {
    public static void main(String[] args) {
        String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex="[0-9]{2}+\\/[0-9]{2}+\\/[0-9]{4}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        boolean found=false;
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
            found=true;
        }
        if(found){
            System.out.println("\b\b");
        }
        else{
            System.out.println("no dates found");
        }
    }
}
