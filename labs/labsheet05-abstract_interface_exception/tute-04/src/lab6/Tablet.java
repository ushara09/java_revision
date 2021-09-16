package lab6;

public class Tablet extends Item {

    String brand, model, camera;

    Tablet(String itemNo, String name, int unitPrice, int qty, String brand, String model, String camera) {
        super(itemNo, name, unitPrice, qty);
        this.brand = brand;
        this.model = model;
        this.camera = camera;
    }

    public void printLine() {
        System.out.println("ItemNo - " + itemNo + "\t" + "Name -" + name + "\t" + "UnitPrice - " + unitPrice + "\t" + "Quntity - " + qty + "\t" + "Brand - " + brand + "\t" + "Model - " + model + "\t" + "Camera - " + camera);
    }


    public void printDetails() {

        super.printDetails();
        System.out.println("Brand - " + brand);
        System.out.println("Model - " + model);
        System.out.println("Camera - " + camera);

    }
}
