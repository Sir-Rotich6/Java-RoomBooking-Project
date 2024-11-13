package com.hotelbooking.service;

import com.hotelbooking.model.Guest;
import com.hotelbooking.model.Room;

public class CheckInService {
    
    public void checkInGuest(Room room, Guest guest) {
        if (room.isAvailable()) {
            room.setAvailable(false);
            System.out.println("Guest " + guest.getName() + " has successfully checked into room " + room.getNumber());
        } else {
            System.out.println("Room " + room.getNumber() + " is not available.");
        }
    }

    public void checkOutGuest(Room room) {
        room.setAvailable(true);
        System.out.println("Room " + room.getNumber() + " is now available.");
    }
}
