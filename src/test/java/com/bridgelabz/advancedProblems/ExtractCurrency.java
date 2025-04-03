package com.bridgelabz.advancedProblems;

import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50";

        // Updated regex to match numbers with or without currency symbols
        String regex = "\\b(?:\\$|Rs)?\\d+(?:\\.\\d{2})?\\b";

        Pattern pricePattern = Pattern.compile(regex);
        Matcher matchPrice = pricePattern.matcher(text);

        boolean found = false;
        while (matchPrice.find()) {
            System.out.println(matchPrice.group());
            found = true;
        }

        if (!found) {
            System.out.println("No Price Found");
        }
    }
}
