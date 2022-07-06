import model.BiologyStudent;
import model.ComputerStudent;
import model.Student;
import model.StudentDB;

import java.util.Arrays;

public class   Main {
    public static void main(String[] args) {

        StudentDB uni=new StudentDB();


        ComputerStudent peter = new ComputerStudent("Peter Meier", "15");

        BiologyStudent sandra=new BiologyStudent("Sandra","17");
        peter.setAdress("Am Ende der Strasse 19 D-12345 Am Ende der Welt");
        peter.setIdentityCardNumber("14.223344");
        uni.addStudent(peter);
        uni.addStudent(sandra);
        uni.addStudent(new ComputerStudent("Paul","3"));

        uni.addStudent(new BiologyStudent("Karl","6"));
        System.out.println("Uniliste:\n"+uni.toString());
        System.out.println("UnilistenEnde");
        System.out.println("StudentID:3 : "+uni.getStudent("3"));
        System.out.println(uni);
        System.out.println(peter.toString());
        System.out.println((peter.getCourseName()));
        System.out.println(peter.getAdress());
        System.out.println(peter.getIdentityCardNumber());
        System.out.println();
    }
}
