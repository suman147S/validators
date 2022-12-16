package com.zohocrm.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender sendmail;
	
	@Override
	public void sendEmail(String to, String sub, String emailbody) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(emailbody);
		
		sendmail.send(mail);
	}

}
