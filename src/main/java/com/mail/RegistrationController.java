package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;

@RestController
public class RegistrationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/signup")
	public String signup() {
		return "Please sign up for our services";
	}
	
	@RequestMapping("/signup-success")
	public String signupSuccess() {
		
		User user = new User();
		
		user.setFirstName("Michael");
		user.setLastName("Legi");
		user.setMailaddress("michael.legenstein@yahoo.de");
		
		try {
			notificationService.sendNotification(user);
		} catch(MailException e) {
			
		}

		
		return "Thx for registration";
	}

}
