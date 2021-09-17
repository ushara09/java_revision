package sampleCode;

public class SingleObject {

    //creating object of single object
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {}

    //Get the only object available
    public static SingleObject getInstance(){
        System.out.println("Object created");
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World !");
    }

}
