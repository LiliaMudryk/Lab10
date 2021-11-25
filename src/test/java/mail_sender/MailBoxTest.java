package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    MailBox mailBox;
    Client client;
    MailInfo info;
    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        client = new Client(20,"Alex",Gender.MALE);
        info = new MailInfo(client,MailCode.GREETINGS);
    }

    @Test
    void addMailInfo() {
        assertEquals(mailBox.getInfos(),new ArrayList<MailInfo>());
        mailBox.addMailInfo(info);
        assertEquals(mailBox.getInfos().size(),1);
    }

    @Test
    void sendAll() throws FileNotFoundException {
        mailBox.addMailInfo(info);
        assertEquals(mailBox.getInfos().size(),1);
        mailBox.sendAll();
        assertEquals(mailBox.getInfos().size(),0);
    }
}