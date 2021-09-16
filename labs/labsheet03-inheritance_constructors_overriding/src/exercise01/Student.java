package exercise01;

public class Student {
    private String name, ditno, address;

    public Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void display(){
        System.out.println("Name - "+name);
        System.out.println("DitNo - "+ditno);
        System.out.println("Address - "+address);
    }

    public String getDetails(){
        String sentenc ="I am a student\nMy name is "+name +"\nI am from "+address+"\nMy DitNo is "+ditno;
        return sentenc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDitno() {
        return ditno;
    }

    public void setDitno(String ditno) {
        this.ditno = ditno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
