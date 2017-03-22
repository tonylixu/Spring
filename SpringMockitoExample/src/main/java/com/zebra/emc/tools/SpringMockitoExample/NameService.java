package com.zebra.emc.tools.SpringMockitoExample;

import org.springframework.stereotype.Service;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
@Service
public class NameService {
    public String getUserName(String id) {
        return "Real user name";
    }
}
