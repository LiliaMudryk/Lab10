package mail_sender;

import java.io.FileNotFoundException;

public class MailSender {
    public void sendMail(MailInfo mailInfo) throws FileNotFoundException {
        System.out.println("Dear "+mailInfo.getClient().getName()+",you got a new message:\n"+mailInfo.getMailText());
    }
}
