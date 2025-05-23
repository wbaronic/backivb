package com.ivb.englishApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivb.englishApp.domain.Message;

@RestController
public class MessageController {
	
	@GetMapping("/message")
	public Message  getMessages(){
		
		return new Message(1L,"Ola",1);
		
	}

}
