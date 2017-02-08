package com.example;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class SmtMailSender {

	@Autowired
	private JavaMailSender sender;
	
	public void send(String to,String subject, String body) throws MessagingException
	{
		MimeMessage mesg=sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mesg,true);
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body);
		
		
		sender.send(mesg);
	}
}
