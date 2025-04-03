package com.bridgelabz.extractionProblems;

import java.util.regex.*;

public class ExtractLinks {
    public static void extract(String text){
        String regex="https?:\\/\\/[^\\s,<>\"]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean found=false;
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
            found=true;
        }
        if(found){
            System.out.println("\b\b");
        }
        else{
            System.out.println("no links found");
        }
    }
    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";
        extract(text);
    }
}
