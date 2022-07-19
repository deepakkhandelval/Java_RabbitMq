package com.example.RabbitMQ.Controller;

import com.example.RabbitMQ.DTO.MessageDTO;
import com.example.RabbitMQ.Services.ReceiverService;
import com.example.RabbitMQ.Services.SendMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
@CrossOrigin
@Slf4j
public class MessageController {

    @Autowired
    ReceiverService receiverService;

    @Autowired
    SendMessageService sendMessageService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody MessageDTO messageDTO) throws Exception {
        sendMessageService.sendMessage(messageDTO.getMessage());
        return new ResponseEntity<String>("Message send", HttpStatus.OK);
    }

    @GetMapping("/receive1")
    public ResponseEntity<String> receiveMessage() throws Exception {
        receiverService.receiveMessage();
        return new ResponseEntity<String>("Message received1", HttpStatus.OK);
    }

    @GetMapping("/receive2")
    public ResponseEntity<String> receiveMessage2() throws Exception {
        receiverService.receiveMessage2();
        return new ResponseEntity<String>("Message received2", HttpStatus.OK);
    }

}
