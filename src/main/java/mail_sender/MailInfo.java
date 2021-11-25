package mail_sender;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.HashMap;
@Getter
public class MailInfo {
    private MailCode mailCode;
    private Client client;
    public MailInfo(Client client,MailCode mailCode){
        this.client=client;
        this.mailCode=mailCode;
    }
    public String getMailText() throws FileNotFoundException {
        String text = mailCode.generateText();
        HashMap<String,String> templates= new HashMap<>();
        templates.put("%NAME%",client.getName());
        templates.put("%AGE%",Integer.toString(client.getAge()));
        for (String key: templates.keySet()){
            text = text.replace(key,templates.get(key));
        }
        return text;
    }

    public Client getClient() {
        return client;
    }
}
