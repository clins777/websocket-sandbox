package dev.clins.websocketsandbox;

import java.time.LocalDateTime;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
  @MessageMapping("/send")
  @SendTo("/topic/messages")
  public Message send(Message message) {
    LocalDateTime timestamp = LocalDateTime.now();
    return new Message(message.getFrom(), message.getMessage(), timestamp);
  }
}
