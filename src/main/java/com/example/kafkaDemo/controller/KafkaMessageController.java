package com.example.kafkaDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaDemo.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class KafkaMessageController
{
	private final Producer producer;

	public KafkaMessageController(Producer producer)
	{
		this.producer = producer;
	}

	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message)
	{
		producer.sendMsgToTopic(message);
	}
}
