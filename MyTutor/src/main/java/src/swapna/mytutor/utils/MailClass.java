package src.swapna.mytutor.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailClass {
	
	@Autowired
	MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String to,String subject,String msg){
		
		/*from="swapnarani.senapati1991@gmail.com";
		to="swapnarani.senapati1991@gmail.com";
		subject="Testing";
		msg="Testing";*/
		
		SimpleMailMessage message=new SimpleMailMessage();
		//message.setFrom(from);
		message.setTo(to);
		
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
		
		
	}
	

}
