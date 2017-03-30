package com.zebra.emc.tools.SpringMongo;

import org.springframework.data.annotation.Id;

/**
 * Created by Tony Li Xu on 3/30/2017.
 */
public class Customer {

    @Id
    public String id;  // Internal use by MongoDB

    public String firstName;
    public String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, firstName='%s', lastName='%s']",
            id, firstName, lastName);
    }
}
