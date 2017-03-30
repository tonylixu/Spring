package com.zebra.emc.tools.SpringMongo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CustomerRepository extends the MongoRepository interface and plugs in the type of values and
 * id it works with: Customer and String. Out-of-the-box, this interface comes with many
 * operations, including standard CURD Ops.
 *
 * Note: You don't need to create an implementation for this class, Spring Data MongoDB creates
 * it on the fly when you run the application.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}
