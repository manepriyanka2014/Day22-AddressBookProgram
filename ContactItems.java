package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactItems {
    // Variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nDetails of " + firstName + " " + lastName + "\n" + "1) First Name   : " + firstName + "\n"
                + "2) Last Name    : " + lastName + "\n" + "3) Address      : " + address + "\n" + "4) City         : "
                + city + "\n" + "5) State        : " + state + "\n" + "6) Zip Code     : " + zipCode + "\n"
                + "7) Phone Number : " + phoneNumber + "\n" + "8) E-mail ID    : " + email + "\n";
    }
}
    