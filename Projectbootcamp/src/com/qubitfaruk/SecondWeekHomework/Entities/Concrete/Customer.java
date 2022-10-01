package com.qubitfaruk.SecondWeekHomework.Entities.Concrete;

public class Customer {
    private String customerName;
    private ROLE role;

    public Customer(String customerName, ROLE role) {
        this(customerName);
        this.role = role;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ROLE getRole() {
        return role;
    }
    public void setRole(ROLE role) {
        this.role = role;
    }


}
