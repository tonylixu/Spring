package com.zebra.emc.tools.SpringRdbmAccess;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
public class Customer {
    private long id;
    private String firstName, lastName, gender;

    public Customer(long id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s', gender='%s']",
            id, firstName, lastName, gender);
    }

    // getters and setters omitted for brevity
    public void setId(long id) {
        this.id=id;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
}
