package com.zebra.emc.tools.SpringScheduleTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @SpringBootApplication is equivalent to using @Configuration, @EnableAutoConfiguration and
 * @ComponentScan with their default attributes
 * @Configuration: Indicates that the class can be used by the Spring IoC (Inversion of Control)
 * container as a source of bean definitions.
 * @EnableAutoConfiguration: Attempts to automatically configure your Spring Application based on
 * the jar dependencies that you have added. For example, if HSQLDB is on your class path and you
 * haven't manually configured any database connection beans, then we will auto-configure an
 * in-memory database.
 * @ComponentScan: An equivalent for Spring XML's <context:component-scan/> (means enable auto
 * scanning feature in Spring.
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }

}
