package exercise08;

public class Dog extends Pet {

    private int noOfMasters;

    public Dog(String n, String o, int a, int noOfMasters) {
        super(n, o, a);
        this.noOfMasters = noOfMasters;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("I am a dog. I have "+noOfMasters+" masters at home.");
    }
}
