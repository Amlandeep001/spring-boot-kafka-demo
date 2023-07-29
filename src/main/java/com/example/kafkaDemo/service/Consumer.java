package com.example.kafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Consumer
{

	@KafkaListener(topics = "${kafka.demo.topic}", groupId = "${spring.kafka.consumer.groupId}")
	public void listenToTopic(String receivedMessage)
	{
		log.info(String.format("$$$$ => Consumed message: %s", receivedMessage));
	}

}
