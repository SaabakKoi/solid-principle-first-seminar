package homework;

public class Persister implements Storage {


    public Persister(){

    }
    public void save(Personable user){
        System.out.println("Save user: " + user.getName());
    }
}
