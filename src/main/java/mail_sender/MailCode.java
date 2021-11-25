package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        // Read file
        // Inject client data
        // Return
        String data = "";
        File text_file = new File(filename);
        Scanner sc = new Scanner(text_file);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            data+=line+"\n";
        }
        return data;
    }
}
