package com.zebra.emc.tools.SpringRabbitMQ;

import java.util.Queue;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Tony Li Xu on 4/3/2017.
 */
@SpringBootApplication
public class Application {

    final static String queueName = "spring-boot";

    @Bean
    Queue quque() {
        return new Queue(queueName, false);
    }

}
