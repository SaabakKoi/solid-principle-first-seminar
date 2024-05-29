package homework;

import srp1.figure.Processable;

public class User implements Personable{
    private final String name;

    public User(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

//    public void save(){
//        Persister persister = new Persister();
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
