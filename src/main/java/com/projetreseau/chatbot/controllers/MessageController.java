package com.projetreseau.chatbot.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetreseau.chatbot.models.Message;
import com.projetreseau.chatbot.services.MessageService;

@RequestMapping
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;


    @PostMapping("/messages")
    @ResponseStatus(HttpStatus.CREATED)
    public Message saveMessage(@RequestBody Message message){        
        return messageService.saveMessage(message);

    }

}


