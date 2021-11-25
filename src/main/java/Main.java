import mail_sender.Client;
import mail_sender.Gender;
import mail_sender.MailCode;
import mail_sender.MailInfo;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client(20,"Alex", Gender.MALE);
        MailInfo info = new MailInfo(client, MailCode.GREETINGS);
        System.out.println(info.getMailText());
    }
}
