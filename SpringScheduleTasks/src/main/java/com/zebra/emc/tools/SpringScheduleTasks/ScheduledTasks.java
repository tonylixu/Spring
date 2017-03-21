package com.zebra.emc.tools.SpringScheduleTasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by TQGF87 on 3/20/2017.
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
