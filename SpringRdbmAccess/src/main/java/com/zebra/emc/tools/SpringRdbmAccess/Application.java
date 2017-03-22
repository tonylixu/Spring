package com.zebra.emc.tools.SpringRdbmAccess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = Logger.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(" +
            "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255), gender VARCHAR(10))");

        // Split up the array of whole names into an array of first/last names
        List<Object[]> splitUpNames = Arrays
            .asList("John Who Male", "Jeff Dean Female", "Josh Bloch Male", "Josh Long Female")
            .stream()
            .map(name -> name.split(" "))
            .collect(Collectors.toList());

        // Use a Java 8 stream to print out each tuple of the list
        splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s "
            + "%s", name[0], name[1])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name, gender) VALUES "
                + "(?,?,"
                + "?)",
            splitUpNames);

        log.info("Quering for customer records where first_name = 'John':");
        jdbcTemplate.query(
            "SELECT id, first_name, last_name, gender FROM customers WHERE first_name = ?", new
                Object[]
                {"Josh"}, (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString
                ("first_name"), rs.getString("last_name"), rs.getString("gender"))
        ).forEach(customer -> log.info(customer.toString()));
    }
}
