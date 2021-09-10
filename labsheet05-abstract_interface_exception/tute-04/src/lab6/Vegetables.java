package lab6;

public class Vegetables extends Item {

    Boolean organic;
    int calories; //per 100 grams

    Vegetables(String itemNo, String name, int unitPrice, int qty, boolean organic, int calories) {
        super(itemNo, name, unitPrice, qty);
        this.organic = organic;
        this.calories = calories;
    }

    public void printLine(){
        super.printLine();
        System.out.println("Organic - "+organic+"\t"+"Calories(per 100 gram) - "+calories);
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Organic - "+organic);
        System.out.println("Calories - "+calories);
    }

}

