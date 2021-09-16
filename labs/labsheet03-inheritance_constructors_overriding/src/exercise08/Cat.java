package exercise08;

public class Cat extends Pet {
    private int livesLeft;

    public Cat(String n, String o, int a,
               int l) {
        super(n, o, a);
        this.livesLeft = l;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("I am a cat."+this.livesLeft+" lives are remaining for me !");
    }

}
