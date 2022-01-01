package com.ayhanunal.keywordsmobilebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
public class KeywordsMobileBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeywordsMobileBackendApplication.class, args);
    }

}
