package it.epicode.week2.day3;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class UsaDate {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();

        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2020, Month.JULY, 2);

        System.out.println(ld2);

        LocalDate ld3 = LocalDate.parse("2023-05-06");

        System.out.println(ld3);

        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());

        System.out.println(ld1.isAfter(ld2));

        System.out.println(ld1.plusDays(20));

        System.out.println(ld1);

        System.out.println(ld2.until(ld1, ChronoUnit.MONTHS));

        LocalTime lt1 = LocalTime.now();

        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(5,45, 45);

        System.out.println(lt2);

        LocalTime lt3 = LocalTime.parse("10:34:45");

        System.out.println(lt3);

        System.out.println(lt1.getHour());

        System.out.println(lt1.until(lt3, ChronoUnit.MINUTES));

        LocalDateTime ldt1 = LocalDateTime.now();

        System.out.println(ldt1);

        System.out.println(ldt1.toEpochSecond(ZoneOffset.UTC));


    }

}
