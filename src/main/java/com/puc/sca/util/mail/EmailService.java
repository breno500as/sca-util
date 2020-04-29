package com.puc.sca.util.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void send(String subject, String text, String emails) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(emails);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);

	}

}
