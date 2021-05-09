package com.wcci.springbootexercise;

public class Employee {

    private String employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Address address;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public Address getAddress() {
        return address;
    }

    public Employee(String employeeId, String firstName, String middleName, String lastName, String suffix, Address address) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.address = address;
    }
}
