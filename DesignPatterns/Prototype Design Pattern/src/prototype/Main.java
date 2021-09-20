package prototype;

class Person implements Cloneable {
    public String firstName;
    public String lastName;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

public class Main {
    public static void main(String args[]){

        Person p1 = new Person();
        p1.firstName = "Ushara";
        p1.lastName = "Geekiyanage";

        try {
            //cloning the p1 object to p2
            Person p2 = p1.clone();

            //cloned object
            System.out.println("First name - "+p2.firstName);
            System.out.println("Last name - "+p2.lastName);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
