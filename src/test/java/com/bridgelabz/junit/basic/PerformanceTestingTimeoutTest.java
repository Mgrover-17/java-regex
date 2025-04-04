package com.bridgelabz.junit.basic;

import com.junit.basic.PerformanceTestingTimeout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.testng.Assert;

public class PerformanceTestingTimeoutTest {

    @Test
    @Timeout(2)
    void shouldTestPerformance(){
        Assertions.assertEquals("Task completed", PerformanceTestingTimeout.longRunningTask());
    }
}
