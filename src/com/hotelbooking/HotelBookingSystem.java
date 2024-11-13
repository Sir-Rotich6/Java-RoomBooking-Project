package com.hotelbooking;

import com.hotelbooking.controller.HotelController;
import com.hotelbooking.model.Guest;
import java.time.LocalDate;

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelController controller = new HotelController();

        // Sample guests
        Guest guest1 = new Guest(1, "John Doe", "123456789", "Non-smoking room");
        Guest guest2 = new Guest(2, "Jane Smith", "987654321", "Close to elevator");

        // Check room availability
        System.out.println("Checking room availability:");
        controller.checkRoomAvailability();

        // Book a room
        System.out.println("\nBooking a room:");
        controller.processBooking(1, guest1, LocalDate.now(), LocalDate.now().plusDays(3));
        controller.processBooking(2, guest2, LocalDate.now(), LocalDate.now().plusDays(2));

        // Generate daily report
        System.out.println("\nDaily Report:");
        controller.generateDailyReport();

        // Check out
        System.out.println("\nChecking out room 1:");
        controller.checkOut(1);
        
        // Check room availability after checkout
        System.out.println("\nChecking room availability:");
        controller.checkRoomAvailability();
    }
}

