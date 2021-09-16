package exercise01;

public class Student {

    private int studentID;
    private String name, degree, mobile;
    private static int max = 100;

    Student(String name, String degree, String mobile) {

        this.studentID = max+1;
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
        getNextStudentID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void print(){
        System.out.println("StudentID - "+this.studentID);
        System.out.println("Name - "+this.name);
        System.out.println("Degree - "+this.degree);
        System.out.println("Mobile- "+this.mobile);
    }

    public static int getNextStudentID(){
       return max+=1;
    }
}
