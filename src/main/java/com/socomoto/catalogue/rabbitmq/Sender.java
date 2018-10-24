package com.socomoto.catalogue.rabbitmq;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class Sender {


    @Inject
    RabbitTemplate template;

    @GetMapping("/jenvoie")
    public String send(String message){

        template.convertAndSend("test", "", message);
        return "envoie effectué avec succès";


    }
}
