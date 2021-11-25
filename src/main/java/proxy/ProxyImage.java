package proxy;

import lombok.Getter;

@Getter
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    public ProxyImage( String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage==(null)) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    public RealImage getRealImage() {
        return realImage;
    }

    public String getFilename() {
        return filename;
    }
}
