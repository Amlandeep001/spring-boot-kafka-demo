package com.example.kafkaDemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer
{
	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "${kafka.demo.topic}", groupId = "${spring.kafka.consumer.groupId}")
	public void listenToTopic(String receivedMessage)
	{
		logger.info(String.format("$$$$ => Consumed message: %s", receivedMessage));
	}

}
