package homework;

import srp1.figure.Processable;

public class Report implements Processable {

    public void report(Personable user){
        System.out.println("Report for user: " + user.getName());
    }
}
