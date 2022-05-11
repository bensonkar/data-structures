package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Quiz {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.DAY_OF_WEEK);
        LocalDate localDate = LocalDate.now();
        DayOfWeek day = localDate.getDayOfWeek();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(dateFormat.format(date));
    }
}
