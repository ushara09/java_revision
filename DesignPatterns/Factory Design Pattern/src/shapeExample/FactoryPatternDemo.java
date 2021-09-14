package shapeExample;

public class FactoryPatternDemo {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //shape - circle
        shapeFactory.getShape("circle").draw();

        //shape - rectangle
        shapeFactory.getShape("rectangle").draw();

        //shape - square
        shapeFactory.getShape("square").draw();
    }
}
