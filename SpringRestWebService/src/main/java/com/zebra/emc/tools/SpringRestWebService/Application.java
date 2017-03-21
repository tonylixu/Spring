package com.zebra.emc.tools.SpringRestWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String args[]) throws Exception {
        SpringApplication.run(Application.class);
    }
}
