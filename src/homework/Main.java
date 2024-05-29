package homework;

import srp1.figure.Processable;

public class Main{
    public static void main(String[] args){
        Personable user = new User("Bob");
        UserView view = new UserView();
        view.processing(user);
//        user.report();
//        user.save();
    }
}