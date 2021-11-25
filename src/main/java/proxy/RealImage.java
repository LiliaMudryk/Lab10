package proxy;

import lombok.Getter;

@Getter
public class RealImage implements Image {
    private String filename;
    public RealImage(String filename){
        this.filename = filename;

    }

    @Override
    public void display() {
        System.out.println("Display");
    }
    public void loadFromDisk(){
        System.out.println("Loading from disk");
    }

    public String getFilename() {
        return filename;
    }
}
