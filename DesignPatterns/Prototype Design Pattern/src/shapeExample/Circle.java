package shapeExample;

public class Circle extends Shape{

    private String type;

    Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle draw() method ");
    }
}
