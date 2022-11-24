package com.example.springserverfilemanager;

import com.example.springserverfilemanager.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringServerFileManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerFileManagerApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService){
        return (args) -> {
            storageService.init();
        };
    }
}
