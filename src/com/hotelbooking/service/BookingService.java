package com.hotelbooking.service;

import com.hotelbooking.model.Booking;
import com.hotelbooking.model.Guest;
import com.hotelbooking.model.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public boolean isRoomAvailable(Room room, LocalDate startDate, LocalDate endDate) {
        return room.isAvailable() && bookings.stream().noneMatch(
                booking -> booking.getRoomNumber() == room.getNumber() &&
                           (startDate.isBefore(booking.getEndDate()) && endDate.isAfter(booking.getStartDate())));
    }

    public Booking bookRoom(Room room, Guest guest, LocalDate startDate, LocalDate endDate) {
        if (isRoomAvailable(room, startDate, endDate)) {
            Booking newBooking = new Booking(startDate, endDate, room.getNumber(), guest);
            bookings.add(newBooking);
            room.setAvailable(false);
            return newBooking;
        } else {
            System.out.println("Room is not available for the selected dates.");
            return null;
        }
    }

    public void checkOut(Room room) {
        room.setAvailable(true);
        bookings.removeIf(booking -> booking.getRoomNumber() == room.getNumber());
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}
