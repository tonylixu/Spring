package com.zebra.emc.tools.SpringUploadFiles;

import com.zebra.emc.tools.SpringUploadFiles.storage.StorageProperties;
import com.zebra.emc.tools.SpringUploadFiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
/*
* @SpringBootApplication equals:
*   - @Configuration: Indicates that Application class can be used by IoC container.
*   - @EnableAutoConfiguration: Automatically configure Spring app based on the jar dependencies.
*   - @ComponentScan: Equivalent for "conext:componenet-scan", specify the base packages to scan.
*
* @EnableConfigurationProperties: Enable support for "ConfigurationProperties" annotated beans.
* "ConfigurationProperties" beans can be registered in the standard way (@Bean) or for
* convenience, can be specified directly on the annotation.
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    /* Perform tasks after all Spring Beans are created and the Application Context has been
     * created.
     */
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }

}
