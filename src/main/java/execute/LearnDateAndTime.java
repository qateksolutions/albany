package execute;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDateAndTime {
    public void formatDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm:ss");

        //System.out.println(dtf.format(currentTime));

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
