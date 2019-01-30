import me.wisehands.workinghours.WorkingHoursCheker;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        long timeOne = 1548062533295L;
        long timeTwo = 1548084533295L;

        Date date = new Date();

        Date startTime = new Date(timeOne);
        Date endTime = new Date(timeTwo);

        WorkingHoursCheker.isWorkingTime(startTime, endTime, date);

        System.out.println("time in milliseconds " + date.getTime());

    }
}
