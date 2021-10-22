import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeTypesJava {

    public static void main(String[] args) {

        /* EVERY AVAILABLE ZONE */
        for(String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }

        //dates
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2021, Month.FEBRUARY,15);

            /* You can add days, months, years etc.*/
        System.out.println(ld);
        ld.plusYears(3);
        System.out.println("added plus 3 years: " + ld);
        System.out.println(ld2);

        //Date Time Formatter
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
            /* more possible combinations for this pattern */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd 'hi there' MMMM yyyy yyy yy y");
        System.out.println(ld2.format(dtf2)); //this both are same
        System.out.println(dtf2.format(ld2)); //this both are same

        //times
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(14,38,20,10);

        System.out.println(lt);
        System.out.println(lt2);

        //date and times
        LocalDateTime ldt = LocalDateTime.of(ld,lt); // or you can specify parameter per parameter like previously
        System.out.println(ldt);

        //zoned date and times
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Ust-Nera"));
        System.out.println(zdt);


    }
}
