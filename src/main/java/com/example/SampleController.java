package com.example;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	SmtMailSender mailSender;
	
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/send")
	public String mailsend() throws MessagingException
	{
		mailSender.send("g.srikanth17@gmail.com", "test", "srikanth");
		return "Check Your Mail Once";
	}
}
