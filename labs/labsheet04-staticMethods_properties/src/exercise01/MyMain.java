package exercise01;

public class MyMain {
     public static void main(String args[]){
//          Student students[];
//          students = new Student[];

          //Student objects
          Student s1 = new Student("ushara", "SE","11111");
          Student s2 = new Student("hasitha", "CSSE","22222");
          Student s3 = new Student("lochana", "DS","33333");
          Student s4 = new Student("savith", "IM","44444");
          Student s5 = new Student("dilan", "ISE","55555");

          //Student type array
          Student[] student = new Student[5];

          student[0] = s1;
          student[1] = s2;
          student[2] = s3;
          student[3] = s4;
          student[4] = s5;

          for(int i = 0; i < 5; i++){
               student[i].print();
               System.out.println("====================================");
          }



     }
}
