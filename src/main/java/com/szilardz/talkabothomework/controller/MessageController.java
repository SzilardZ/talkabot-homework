package com.szilardz.talkabothomework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.szilardz.talkabothomework.model.Message;
import com.szilardz.talkabothomework.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/")
	public String welcome() {
		return "Hi Talk-A-Bot! This is just a string, not the exercise itself. " 
				+ "INSTRUCTIONS: for get all messages, type /messages in the URL. " 
				+ "For get the actual message's text, type /message/1 in the URL (message not in plural but singular!)";
	}
	
	
	@GetMapping("/message/{id}")
	public String getMessage(@PathVariable String id) {
		Message message = messageService.getMessage(Long.valueOf(id));
		return message.getText();
	}
	
	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}
	
}


