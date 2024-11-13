package com.hotelbooking.model;

public class Service {
    private String type;
    private double cost;
    private boolean isCompleted;

    public Service(String type, double cost) {
        this.type = type;
        this.cost = cost;
        this.isCompleted = false;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void completeService() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return type + " - $" + cost + (isCompleted ? " (Completed)" : " (Pending)");
    }
}

