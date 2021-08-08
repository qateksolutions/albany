package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static String returnNextMonth() {
        // Create Date Object
        Date dNow = new Date();

        // Create calendar object for Gregorian Calender
        Calendar calendar = new GregorianCalendar();

        // Set calendar date to current date
        calendar.setTime(dNow);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");
        calendar.add(Calendar.MONTH, 1);

        return sdf.format(calendar.getTime());
    }
}
