package com.zebra.emc.tools.SpringRestWebService;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Tony Li Xu on 3/21/2017.
 */
@Component
public class QuoteTasks {

    private static final Logger log = Logger.getLogger(Application.class);

    @Scheduled(fixedRate = 5000)
    public void getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        // Convert the incoming data into a Quote object
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",
            Quote.class);
        log.info(quote.toString());
    }
}
