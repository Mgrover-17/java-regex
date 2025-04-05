package com.bridgelabz.junit.advanced;

import com.junit.advanced.DateFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void shouldTestValidDate(){
        Assertions.assertEquals("04-04-2025", DateFormatter.formatDate("2025-04-04"));
    }

    @Test
    void shouldTestInvalidFormat(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            DateFormatter.formatDate("05/04/2025");
        });
    }

    @Test
    void shouldTestInvalidLogicalDate(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            DateFormatter.formatDate("2025-02-30");
        });
    }

    @Test
    void shouldTestNullAndEmpty(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            DateFormatter.formatDate("");
        });

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            DateFormatter.formatDate(null);
        });
    }
}
