package com.example.kafkaDemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer
{
	private final KafkaTemplate<String, String> kafkaTemplate;
	private final String kafkaTopic;

	public Producer(KafkaTemplate<String, String> kafkaTemplate, @Value("${kafka.demo.topic}") String kafkaTopic)
	{
		this.kafkaTemplate = kafkaTemplate;
		this.kafkaTopic = kafkaTopic;
	}

	public void sendMsgToTopic(String message)
	{
		kafkaTemplate.send(kafkaTopic, message);
	}
}
