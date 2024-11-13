package com.hotelbooking.controller;

import com.hotelbooking.model.Guest;
import com.hotelbooking.model.Room;
import com.hotelbooking.service.BookingService;
import com.hotelbooking.service.RoomService;
import com.hotelbooking.service.ReportService;
import java.time.LocalDate;

public class HotelController {
    private RoomService roomService = new RoomService();
    private BookingService bookingService = new BookingService();
    private ReportService reportService = new ReportService();

    public void checkRoomAvailability() {
        roomService.getAvailableRooms().forEach(System.out::println);
    }

    public void processBooking(int roomNumber, Guest guest, LocalDate startDate, LocalDate endDate) {
        Room room = roomService.getRoomByNumber(roomNumber);
        if (room != null) {
            bookingService.bookRoom(room, guest, startDate, endDate);
        } else {
            System.out.println("Room not found.");
        }
    }

    public void checkOut(int roomNumber) {
        Room room = roomService.getRoomByNumber(roomNumber);
        if (room != null) {
            bookingService.checkOut(room);
        } else {
            System.out.println("Room not found.");
        }
    }

    public void generateDailyReport() {
        reportService.generateDailyReport(bookingService.getAllBookings());
    }
}

