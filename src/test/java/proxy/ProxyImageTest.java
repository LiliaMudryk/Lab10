package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;
    @BeforeEach
    void setUp() {
        proxyImage=new ProxyImage("rainbow.png");
    }

    @Test
    void display() {
        proxyImage.display();
        assertEquals(proxyImage.getRealImage().getFilename(),new RealImage("rainbow.png").getFilename());
    }
}