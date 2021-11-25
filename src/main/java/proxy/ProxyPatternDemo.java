package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String file_name = "rainbow.png";
        ProxyImage img = new ProxyImage(file_name);
        img.display();

    }
}
