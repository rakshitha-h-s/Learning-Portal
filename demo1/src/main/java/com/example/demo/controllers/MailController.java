package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mail.*;
@RestController
public class MailController {
	private MailSender m=new MockMailSender();
		@RequestMapping("/mail")
	public String hello()
	{	
		m.send("adb@gmail.com","test mail","body of the test mail");
		return "mail sent";
	}
}
