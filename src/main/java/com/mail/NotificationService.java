package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.domain.User;

@Service
public class NotificationService {
	
	 private JavaMailSender javaMailSender;
	 
	 @Autowired
	 public NotificationService(JavaMailSender javaMailSender) {
		 this.javaMailSender = javaMailSender;
	 }
	 
	 public void sendNotification(User user) throws MailException {
		 //send mail
		 SimpleMailMessage mail = new SimpleMailMessage();
		 mail.setTo(user.getMailaddress());
		 mail.setFrom("mailaddress");
		 mail.setSubject("Your registration");
		 mail.setText("Thank you for your registration. Have fun!");
		 
		 javaMailSender.send(mail);
	 }

}
