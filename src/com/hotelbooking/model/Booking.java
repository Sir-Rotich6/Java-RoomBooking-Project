package com.hotelbooking.model;

import java.time.LocalDate;

public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private int roomNumber;
    private Guest guest;

    public Booking(LocalDate startDate, LocalDate endDate, int roomNumber, Guest guest) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomNumber = roomNumber;
        this.guest = guest;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Guest getGuest() {
        return guest;
    }

    @Override
    public String toString() {
        return "Booking for Room " + roomNumber + " from " + startDate + " to " + endDate + " - " + guest.getName();
    }
}

