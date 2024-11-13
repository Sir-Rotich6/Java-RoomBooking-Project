package com.hotelbooking.model;

public class Guest {
    private int id;
    private String name;
    private String contact;
    private String preferences;

    public Guest(int id, String name, String contact, String preferences) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.preferences = preferences;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "Guest ID: " + id + ", Name: " + name + ", Contact: " + contact + ", Preferences: " + preferences;
    }
}
