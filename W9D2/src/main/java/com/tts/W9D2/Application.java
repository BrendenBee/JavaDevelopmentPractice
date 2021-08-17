package com.tts.W9D2;

import com.tts.W9D2.model.Customer;
import com.tts.W9D2.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository) {
        return (args) -> {
            customerRepository.save(new Customer("Michael", "Smith"));
            customerRepository.save(new Customer("Aaron", "Moon"));
            customerRepository.save(new Customer("Jimmy", "Smits"));

            log.info("Customers added successfully to database!");
        };
    }

}