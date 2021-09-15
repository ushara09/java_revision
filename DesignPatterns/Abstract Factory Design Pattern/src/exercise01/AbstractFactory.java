package exercise01;

//Create an Abstract class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
