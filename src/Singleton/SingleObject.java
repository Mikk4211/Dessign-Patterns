package Singleton;

// @Author Mikk4211
// @www.github.com/mikk4211

public class SingleObject {

    // Her laver vi et nyt objekt
    public static SingleObject instance = new SingleObject();

    // Private constructor så klassen ikke kan instantieres
    private SingleObject() {}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Dette er en SingleTon besked.");

    }

}
