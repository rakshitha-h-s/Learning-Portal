package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender {
	private static Log log=LogFactory.getLog(MockMailSender.class);
	@Override
public void send(String to,String subject,String body)
{
	log.info("sending mail to"+to);
	log.info("with body"+body);
	log.info("with subject"+subject);
}
}
