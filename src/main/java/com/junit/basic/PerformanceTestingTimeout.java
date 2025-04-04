package com.junit.basic;

public class PerformanceTestingTimeout {
    public static String longRunningTask(){
        try{
            //Thread.sleep(3000); fail
            Thread.sleep(1500); //pass
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task completed";
    }
}
