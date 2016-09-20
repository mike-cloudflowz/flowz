package flowz.cloudflowz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import flowz.cloudflowz.domain.EmailUserZ;
import flowz.cloudflowz.services.EmailzService;

@RestController
public class EmailzController {
   
    @Autowired
    EmailzService emailzService;
         
     @RequestMapping(value = "/emailz", method = RequestMethod.POST)
        public void add(@RequestBody EmailUserZ emailUserZ) {
            try {
                emailzService.sendEmail(emailUserZ);
            } // end try
            catch (MailException me) {
                me.printStackTrace();
            } // end catch MailException
           
            catch (Exception e) {
            	e.printStackTrace();
            } // end catch Exception
        }
   
}