package com.bridgelabz.replaceAndModifyStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example, by an idiot,  with some stupid words";

        String [] badWords = { "damn", "stupid", "idiot"};

        String regex = String.join("|",badWords);

        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        String censoredText = matcher.replaceAll("****");

        System.out.println(censoredText);

    }
}
