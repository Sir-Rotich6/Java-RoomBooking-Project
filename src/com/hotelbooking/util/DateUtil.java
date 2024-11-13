package com.hotelbooking.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    public static long daysBetween(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }

    public static boolean isDateInRange(LocalDate date, LocalDate start, LocalDate end) {
        return (date.isEqual(start) || date.isEqual(end) || (date.isAfter(start) && date.isBefore(end)));
    }

    public static boolean isValidBookingDate(LocalDate startDate, LocalDate endDate) {
        return startDate.isBefore(endDate);
    }
}

