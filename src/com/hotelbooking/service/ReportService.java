package com.hotelbooking.service;

import com.hotelbooking.model.Booking;
import java.util.List;

public class ReportService {
    public void generateDailyReport(List<Booking> bookings) {
        System.out.println("Daily Occupancy Report:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}
