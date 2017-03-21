package com.zebra.emc.tools.SpringScheduleTasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Indicate that the ScheduledTasks class is considered as candidates for auto-detection when
 * using annotation-based configuration and classpath scanning.
 *
 * The @Component marks ScheduleTasks class as a bean so that the component-scanning mechanism of
 * spring can pick it up and pull it into the application context.
 */
@Component
public class ScheduledTasks {

    private static final Logger log = Logger.getLogger(ScheduledTasks.class.getName());
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("LOG: The time is now " + dateFormat.format(new Date()));
    }
}
