package shapeExample;

public class Square extends Shape{

    private String type;

    Square(){
        this.type = "square";
    }

    @Override
    void draw() {
        System.out.println("Inside the Square class draw() method");
    }
}
