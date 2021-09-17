package shapeExample;

public class Rectangle extends Shape{

    private String type;

    Rectangle(){
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle class draw() method");
    }
}
