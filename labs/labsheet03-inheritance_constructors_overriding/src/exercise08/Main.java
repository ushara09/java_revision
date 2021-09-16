package exercise08;

public class Main {
    public static void main(String[] args) {
        Pet p = new Pet("Lissie", "Smith", 3);
        p.showDetails();
        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();

        //DogObject
        Dog dog = new Dog("Lucky", "Shalini",0,4);
        dog.showDetails();

    }
}
