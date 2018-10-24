package com.socomoto.catalogue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication
public class CatalogueApplication implements CommandLineRunner {


    @Inject
    RabbitTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        template.convertAndSend("test","", "le maitre du navire");
    }
}
