package homework;

import srp1.figure.Processable;

public class UserView {
    public UserView() {

    }

    public void processing(Personable user){
        Processable report = new Report();
        Storage persister = new Persister();
        report.report(user);
        persister.save(user);
    }
}
