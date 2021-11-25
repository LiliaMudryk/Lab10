package mail_sender;

import lombok.Getter;

@Getter
public class Client {
    @Template(key = "%AGE%")
    private  int age;
    @Template(key ="%NAME%")
    private String name;
    private int id;
    @Template(key ="%GENDER%")
    private Gender sex;

    public Client(int age, String name,Gender sex){
        this.age=age;
        this.name=name;
        this.sex = sex;
        this.id = IdGenerator.generateId();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getSex() {
        return sex;
    }
    public int getId(){
        return id;
    }
    public static class IdGenerator{
        private static  int counter=0;
        public static int generateId(){
            counter++;
            return counter;
        }
    }
}
