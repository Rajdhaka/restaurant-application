package com.geekster.restaurant.model;

public class Restaurant {
    private String restaurantId;
    private  String restaurantName;
    private String specialty;
    private String address;
    private String contactNumber;
    private int totalStaff;

    public Restaurant(String restaurantId,String restaurantName,String specialty, String address,String contactNumber,int totalStaff) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.specialty = specialty;
        this.address = address;
        this.contactNumber = contactNumber;
        this.totalStaff = totalStaff;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
