package com.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

	@RabbitListener(queues = RabbitMqConfig.queueName)
	public void listen(String msg) {
		System.out.println("Data: "+msg);
	}
}
