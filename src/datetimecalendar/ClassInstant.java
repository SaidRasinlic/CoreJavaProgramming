package datetimecalendar;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ClassInstant {

    public static void main(String[] args) {

        System.out.println(Instant.ofEpochMilli(new Date().getTime()));

        Instant ins = Instant.now();

        System.out.println(ins);

        Instant start = Instant.now();
        Instant end, secondiff = Instant.now();
        float etafps = 1000f / 30f;
        int currentFrame = 0;
        int fps = 0;

        while (true) {
            end = Instant.now();
            if (start.until(end, ChronoUnit.MILLIS) > etafps) {
                start = Instant.now();
                fps++;
            }
            if (secondiff.until(end, ChronoUnit.MILLIS) >= 1000) {
                System.out.print(fps + "\r");
                fps = 0;
                secondiff = Instant.now();

            }
        }

        /*Potrebno je kreirati program koji će izvršavati određeni metod u određenom vremenskom intervalu 
   (na primjer 30 puta u sekundi) • Metod koji treba pozivati se može zvati tick • Unutar metode tick,
   treba prikazati trenutnu brzinu izvršavanja (broj frejmova po sekundi) */
    }

}
