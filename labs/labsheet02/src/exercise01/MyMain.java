package exercise01;

public class MyMain {
    public static void main(String args[]){

        int miles = 26;
        int yards = 385;
        double kilometers;

        double kmInMiles = miles/0.62137;
        double kmInYards = yards/0.0009144;

        kilometers = kmInMiles + kmInYards;

        double roundOff = Math.round(kilometers)/100.00;

        System.out.println("Number of KM - "+roundOff);


    }
}
