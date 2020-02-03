package datetimecalendar;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateClass {

    public static void main(String[] args) {

        // create an LocalDate object 
        LocalDate now = LocalDate.now();
        System.out.println("Current date: " + now);
        System.out.println("Current month: " + now.getMonth() + " (" + now.getMonthValue() + ") ");
        System.out.println("Current year: " + now.getYear());
        System.out.println("Current day: " + now.getDayOfMonth() + " (" + now.getDayOfWeek() + ") ");

        LocalTime userDefinedTime = LocalTime.of(14, 10, 25);
        System.out.println(userDefinedTime);

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H-m-s");
        // System.out.println(formatter.format(now));
        //  Duration d = Duration.between(userDefinedTime,now );
        //    System.out.println(d);
        System.out.println("Period");

        Period p = Period.between(LocalDate.of(2014, Month.MARCH, 20), LocalDate.now());
        System.out.println(p);
        System.out.println("Years: " + p.getYears() + "\nMonths: " + p.getMonths() + "\nDays: " + p.getDays());


        System.out.println("DURATIOOOON");

   
 //LocalTime.of(13, 30, 00);
        LocalTime intialTime = LocalTime.now();
        LocalTime finalTime =  intialTime.plusHours(4);
   Duration d = Duration.between(intialTime, finalTime);
        System.out.println(d.toDays() + ":" + d.toHours() + ":" + d.toMinutes());
        System.out.println(d);

    }
}
