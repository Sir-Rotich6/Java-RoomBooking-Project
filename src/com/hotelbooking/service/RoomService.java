package com.hotelbooking.service;

import com.hotelbooking.model.Room;
import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Room> rooms = new ArrayList<>();

    public RoomService() {
        initializeRooms();
    }

    private void initializeRooms() {
        for (int i = 1; i <= 50; i++) {
            rooms.add(new Room(i, "Standard", 100.00));
        }
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Room getRoomByNumber(int number) {
        return rooms.stream().filter(room -> room.getNumber() == number).findFirst().orElse(null);
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}

