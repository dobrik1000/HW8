package com.company;

public class Address {
    private String city;
    private String street;
    private int home;

    public Address(String city, String street, int home){
        this.city = city;
        this.street = street;
        this.home = home;
}
    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    @Override
    public String toString() {
        return " city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                '}';
    }
}
