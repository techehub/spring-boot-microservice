package com.vijeesh.jms.topic.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    Sender sender;

    @GetMapping("/send/{msg}")
    public void sendMessage( @PathVariable ("msg") String msg){

        sender.send(msg);

    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
