package singletonPattern;

import javax.management.ObjectName;

class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

public class Main {
    public static void main(String args[]){

        Object object1 = new Object();
        Object object2 = new Object();

        //points to difference memory address
        System.out.println(object1);
        System.out.println(object2);

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        //points to same memory address
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);


    }
}
