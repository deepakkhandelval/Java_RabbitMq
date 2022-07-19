package com.example.RabbitMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

@SpringBootApplication
public class RabbitMqApplication {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabbitMqApplication.class, args);
    }

}
