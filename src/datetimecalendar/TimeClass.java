package datetimecalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;

public class TimeClass {

    public static void main(String[] args) throws ParseException {

        // System.out.println(System.currentTimeMillis()); Date dt = new Date();  Date dt = new Date(); System.out.println(dt.getTime());
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        String time = "2014 December 15";
        Date date_input = sdf.parse(time);
        System.out.println(date_input);

        System.out.println("Gregorian Calendar");

        GregorianCalendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, 2014);
        cal.set(Calendar.DATE, 15);
        cal.set(Calendar.MONTH, 11);
        System.out.println(cal.getTime());
        System.out.println("The exact month is: " + (cal.get(Calendar.MONTH) + 1));

        GregorianCalendar source_date = new GregorianCalendar(2014 ,10, 8);

        GregorianCalendar current_date = new GregorianCalendar();
        current_date.add(Calendar.HOUR, 4);
        System.out.println(current_date.before(source_date));
        
        
        
        
        
        
        
        
        
        

    }

}
