package com.szilardz.talkabothomework.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.szilardz.talkabothomework.model.Message;
import com.szilardz.talkabothomework.service.MessageService;

@Component
public class Initializer {
	
	@Autowired
	private MessageService messageService;
	
	@PostConstruct
	public void init() {
		Message message = new Message("Hello Talk-A-Bot!");
		messageService.addMessage(message);
	}

}
