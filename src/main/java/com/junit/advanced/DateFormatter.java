package com.junit.advanced;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
     public static String formatDate(String inputDate){
        if(inputDate==null){
            throw new IllegalArgumentException("Input date is null");
        }
        try{
            DateTimeFormatter input=DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter output=DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate date=LocalDate.parse(inputDate,input);
            return date.format(output);
        }
        catch (DateTimeParseException e){
            throw new IllegalArgumentException("invalid:"+inputDate);
        }
    }
}
