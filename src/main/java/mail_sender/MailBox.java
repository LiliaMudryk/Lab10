package mail_sender;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.ArrayList;
@Getter
public class MailBox {
    private ArrayList<MailInfo> infos;
    private MailSender sender;
    public MailBox(){
        infos=new ArrayList<MailInfo>();
        sender = new MailSender();
    }
    public void addMailInfo(MailInfo maiInfo){
        infos.add(maiInfo);
    }
    public void sendAll() throws FileNotFoundException {
        for (MailInfo info: infos){
            sender.sendMail(info);
        }
        infos=new ArrayList<MailInfo>();
    }

    public ArrayList<MailInfo> getInfos() {
        return infos;
    }
}
