package builderPattern;

interface IComputerBuilder {
    void setMonitor();

    void setMouse();

    void setKeyboard();

    void setTower();

    void setPrinter();

    Computer getComputer();
}

class Computer {
    public String moniter;
    public String mouse;
    public String keyboard;
    public String tower;
    public String printer;
}

class ComputerABuilder implements IComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void setMonitor() {
        computer.moniter = "Dual";
    }

    @Override
    public void setMouse() {
        computer.mouse = "Wireless mouse";
    }

    @Override
    public void setKeyboard() {
        computer.keyboard = "wireless keyboard";
    }

    @Override
    public void setTower() {
        computer.tower = "Tall tower";
    }

    @Override
    public void setPrinter() {
        computer.printer = "Black and white printer";
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}


class ComputerBBuilder implements IComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void setMonitor() {
        computer.moniter = "Single";
    }

    @Override
    public void setMouse() {
        computer.mouse = "Wire mouse";
    }

    @Override
    public void setKeyboard() {
        computer.keyboard = "wire keyboard";
    }

    @Override
    public void setTower() {
        computer.tower = "Short tower";
    }

    @Override
    public void setPrinter() {
        computer.printer = "Colored printer";
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

class ComputerCreator{
    private IComputerBuilder iComputerBuilder;

    ComputerCreator(IComputerBuilder iComputerBuilder){
        this.iComputerBuilder = iComputerBuilder;
    }

    public void CreateComputer(){
        iComputerBuilder.setKeyboard();
        iComputerBuilder.setMonitor();
        iComputerBuilder.setMouse();
        iComputerBuilder.setPrinter();
        iComputerBuilder.setTower();
    }

    public Computer getComputer(){
        return iComputerBuilder.getComputer();
    }

}


public class MyMain {

    public static void main(String args[]){
        ComputerCreator computerACreator = new ComputerCreator(new ComputerABuilder());
        computerACreator.CreateComputer();

        System.out.println("Computer A");
        System.out.println(computerACreator.getComputer().moniter);
        System.out.println(computerACreator.getComputer().keyboard);
        System.out.println(computerACreator.getComputer().printer);
        System.out.println(computerACreator.getComputer().mouse);
        System.out.println(computerACreator.getComputer().tower);

        System.out.print("\n");

        ComputerCreator computerBCreator = new ComputerCreator(new ComputerBBuilder());
        computerBCreator.CreateComputer();

        System.out.println("Computer B");
        System.out.println(computerBCreator.getComputer().moniter);
        System.out.println(computerBCreator.getComputer().keyboard);
        System.out.println(computerBCreator.getComputer().printer);
        System.out.println(computerBCreator.getComputer().mouse);
        System.out.println(computerBCreator.getComputer().tower);

    }

}
