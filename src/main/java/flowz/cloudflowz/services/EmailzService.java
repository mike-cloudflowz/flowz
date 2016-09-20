package flowz.cloudflowz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.EmailUserZ;

@Service
public class EmailzService {

  private JavaMailSender javaMailSender;

  @Autowired
  public EmailzService(JavaMailSender javaMailSender) throws MailException {
   
      this.javaMailSender = javaMailSender;
  }

  public void sendEmail(EmailUserZ emailUserZ) {
    // send email  
    SimpleMailMessage mail = new SimpleMailMessage();
    mail.setTo(emailUserZ.getToAddr());
    mail.setSubject(emailUserZ.getToSubj());
    mail.setText(emailUserZ.getToBody());
    mail.setFrom("emailz@cloudflowz.com");
    
    javaMailSender.send(mail);

  }

 
}
