package com.szilardz.talkabothomework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szilardz.talkabothomework.model.Message;
import com.szilardz.talkabothomework.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message getMessage(Long id) {
        return messageRepository.findAllById(id);
    }

    public void addMessage(Message message) {
        messageRepository.save(message);
    }

}
