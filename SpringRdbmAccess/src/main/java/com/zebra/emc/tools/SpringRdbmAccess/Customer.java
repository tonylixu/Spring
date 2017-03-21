package com.zebra.emc.tools.SpringRdbmAccess;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
public class Customer {
    private long id;
    private String firstName, lastName;

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
        )
    }

    // getters and setters omitted for brevity
}
