package com.revature.autosurvey.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.revature.autosurvey.services.IOServiceImpl;

@RestController
public class IOController {
	@Autowired
	private IOServiceImpl ioService;
	
	@PostMapping("io")
	public void sendEmail(@RequestParam(name = "recipient") String[] recipients, @RequestParam(name = "subject") String subject, 
			@RequestParam(name = "message") String message, @RequestParam(name = "attachment", defaultValue="") String[] attachments) {
		
		ioService.SendEmail(recipients, subject, message, attachments);
	}
}