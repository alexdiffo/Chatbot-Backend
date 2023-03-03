package com.projetreseau.chatbot.services;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetreseau.chatbot.models.Message;
import com.projetreseau.chatbot.repositories.MessageRepository;

@Service
public class MessageService {

    @Autowired
	private MessageRepository messageRepository;

    public Message saveMessage(Message message) {

        message.setMessageId(UUID.randomUUID().toString().split("-")[0]);
        message.setMessage(message.getMessage());
        message.setTime(message.getTime());        
        return messageRepository.save(message);
    }


    
}




    
    
