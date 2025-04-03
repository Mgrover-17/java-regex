package com.bridgelabz.extractionProblems;

import java.util.regex.*;

public class ExtractCapitalWords {
    public static void extract(String text){
        String regex="\\b[A-Z][a-z]*\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        boolean found=false;
        while(matcher.find()){
            System.out.print(matcher.group()+",");
            found=true;
        }
        if (found) {
            System.out.println("\b "); // Remove last comma and space
        } else {
            System.out.println("No capitalized words found.");
        }
    }

    public static void main(String[] args) {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extract(text);
    }
}
