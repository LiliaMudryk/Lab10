package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    Client client;
    MailInfo info;
    @BeforeEach
    void setUp() {
        client = new Client(20,"Alex",Gender.MALE);
        info = new MailInfo(client,MailCode.GREETINGS);
    }

    @Test
    void getMailText() throws FileNotFoundException {
        assertEquals(info.getMailText(),"Hi, Alex!\n" +"How are you?\n");
    }
}