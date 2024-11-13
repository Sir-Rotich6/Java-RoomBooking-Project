package com.hotelbooking.model;

public class Room {
    private int number;
    private String type;
    private boolean isAvailable; //I used isAvailable instead of status for readability
    private double price;

    public Room(int number, String type, double price) {
        this.number = number;
        this.type = type;
        this.isAvailable = true;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room " + number + " [" + type + "] - $" + price + (isAvailable ? " (Available)" : " (Occupied)");
    }
}
