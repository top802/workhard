import me.wisehands.workinghours.WorkingHoursCheker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {


        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");

        String stringStartTime = "08:32";
        String stringEndTime = "22:22";

        Date startTime = simpleDateFormat.parse(stringStartTime);
        Date endTime = simpleDateFormat.parse(stringEndTime);

        WorkingHoursCheker.isWorkingTime(startTime, endTime, date);

        System.out.println("time in milliseconds " + date.getTime());

    }
}
