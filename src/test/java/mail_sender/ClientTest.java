package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    @BeforeEach
    void setUp() {
        client = new Client(20,"Alex",Gender.MALE);
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(),20);
    }

    @Test
    void getName() {
        assertEquals(client.getName(),"Alex");
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(),Gender.MALE);
    }

    @Test
    void getId() {
    }
}