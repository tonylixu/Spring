package com.zebra.emc.tools.SpringMockitoExample;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
// Tells Spring to apply this configuration only when "test" profile is active
@Profile("test")
@Configuration
public class NameServiceTestConfiguration {
    @Bean
    // @Primary Makes sure this instance is used instead of a real one for autowiring. The method
    // itself creates and returns a Mockito mock
    @Primary
    public NameService nameService() {
        return Mockito.mock(NameService.class);
    }
}
