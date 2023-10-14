package com.example.omnitrix.user;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	
	@Autowired
    private User_repo userRepository;
    
    @Autowired
    private JavaMailSender mailsender;
    
    
    
    public User_data getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    public String otp(String toEmail)
    {
    	SimpleMailMessage message=new SimpleMailMessage();
    	message.setTo(toEmail);
		Random rand=new Random();
		int x=111111;
		int y=999999;
		int z=rand.nextInt(y-x+1)+x;
		message.setText(String.valueOf(z));
		message.setSubject("Otp for your Login process");
		message.setFrom("carswayinventory123@gmail.com");
		mailsender.send(message);
		String ret = String.valueOf(z);
		return ret;
    }
    
    public User_data loginvalidation(String email,String password)
    {
    	return userRepository.loginvalidation(email, password);
    }

}
