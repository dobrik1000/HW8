package com.company;

public class Person {
    private String firstName;
    private String secondName;
    private Address address;

    public Person(String firstName, String secondName, Address address){
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address=" + address +
                '}';
    }
}
