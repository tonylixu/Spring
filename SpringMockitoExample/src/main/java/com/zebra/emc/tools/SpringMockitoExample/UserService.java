package com.zebra.emc.tools.SpringMockitoExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
@Service
public class UserService {
    private NameService nameService;

    @Autowired
    public UserService(NameService nameService) {
        this.nameService = nameService;
    }

    public String getUserName(String id) {
        return nameService.getUserName(id);
    }
}
