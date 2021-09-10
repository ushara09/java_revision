package lab6;

public class Item implements IPrint {

    String itemNo, name;
    int qty, unitPrice;


    Item(String itemNo, String name, int unitPrice, int qty){
        this.itemNo = itemNo;
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    @Override
    public void printLine() {
        System.out.print("ItemNo - "+itemNo+"\t"+"Name -"+name+"\t"+"UnitPrice - "+unitPrice+"\t"+"Quntity - "+qty);
    }

    @Override
    public void printDetails() {

        System.out.println("Item No - "+itemNo);
        System.out.println("Name - "+name);
        System.out.println("Unit Price- "+unitPrice);
        System.out.println("Quantity- "+qty);

    }
}
