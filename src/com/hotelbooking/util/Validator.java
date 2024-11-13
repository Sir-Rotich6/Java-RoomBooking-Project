package com.hotelbooking.util;

import com.hotelbooking.model.Guest;
import com.hotelbooking.model.Room;

public class Validator {

    public static boolean isGuestValid(Guest guest) {
        return guest.getName() != null && !guest.getName().trim().isEmpty() &&
               guest.getContact() != null && !guest.getContact().trim().isEmpty();
    }

    public static boolean isRoomValid(Room room) {
        return room != null && room.getNumber() > 0;
    }

    public static boolean isBookingDurationValid(int days) {
        return days > 0;
    }
}
