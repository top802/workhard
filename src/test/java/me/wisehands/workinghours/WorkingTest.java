package me.wisehands.workinghours;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkingTest {

    Date startTime;
    Date endTime;
    Date date;



    @Test
    public void timeIsInWorkingHours(){
        startTime = new Date(1548062533295L);
        endTime = new Date(1548084533295L);
        date = new Date(1548765617620L);
        boolean result = WorkingHoursCheker.isWorkingTime(startTime, endTime, date);
        printTime();

        System.out.println("timeIsInWorkingHours:" + result + "\n");
        Assert.assertTrue("Test return TRUE ", WorkingHoursCheker.isWorkingTime(startTime, endTime, date));


    }


    @Test
    public void timeIsBeforeOutWorkingHours(){
        startTime = new Date(1548765617620L);
        endTime = new Date(1548084533295L);
        date = new Date(1548062533295L);

        boolean result = WorkingHoursCheker.isWorkingTime(startTime, endTime, date);
        printTime();
        System.out.println("timeIsOutWorkingHours:" + result + "\n");

        Assert.assertFalse("Test return FALSE ", WorkingHoursCheker.isWorkingTime(startTime, endTime, date));

    }

    @Test
    public void timeIsOutWorkingHours(){
        startTime = new Date(1548062533295L);
        endTime = new Date(1548765617620L);
        date = new Date(1548084533295L);

        boolean result = WorkingHoursCheker.isWorkingTime(startTime, endTime, date);
        printTime();

        System.out.println("timeIsOutWorkingHours:" + result + "\n");

        Assert.assertFalse("Test return FALSE ", WorkingHoursCheker.isWorkingTime(startTime, endTime, date));

    }

    private void printTime() {
        SimpleDateFormat formatK = new SimpleDateFormat("k");
        SimpleDateFormat formatM = new SimpleDateFormat("m");

        int firstMinute = Integer.parseInt(formatM.format(startTime));
        int firstHour = Integer.parseInt(formatK.format(startTime));
        int firstTime = firstHour * 60 + firstMinute;

        int lastMinute = Integer.parseInt(formatM.format(endTime));
        int lastHour = Integer.parseInt(formatK.format(endTime));
        int lastTime = lastHour * 60 + lastMinute;

        int currentHour = (Integer.parseInt(formatK.format(date)));
        int currentMinute = (Integer.parseInt(formatM.format(date)));
        int currentTime = currentHour * 60 + currentMinute;
        System.out.println("date " + date
                + "\n" + "StartTime " + firstHour + ":" + firstMinute + " MinutesFromDayStart: " + firstTime
                + "\n" + "EndTime " + lastHour + ":" + lastMinute + " MinutesFromDayStart: " + lastTime
                + "\n" + "CurrentTime " + currentHour + ":" + currentMinute + " MinutesFromDayStart: " + currentTime + "\n");
    }


}
