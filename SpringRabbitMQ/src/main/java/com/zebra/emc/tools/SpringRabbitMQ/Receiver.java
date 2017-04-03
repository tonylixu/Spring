package com.zebra.emc.tools.SpringRabbitMQ;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

/**
 * Created by Tony Li Xu on 4/2/2017.
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
