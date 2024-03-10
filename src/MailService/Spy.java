package MailService;

import java.util.logging.Level;
import java.util.logging.Logger;

import static MailService.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage mailMessage){
            if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers")){
                logger.log(Level.WARNING,"Detected target mail correspondence: from " + mail.getFrom() +" to "
                        +  mail.getTo() + " \"" + mailMessage.getMessage() + "\"");
            }
            else{
                logger.log(Level.INFO,"Usual correspondence: from " + mail.getFrom() + " to " + mail.getTo());
            }
        }
        return mail;
    }
}
