package model;

public abstract class Student {
    protected String name;
    protected  String adress;
    protected  String identityCardNumber;
    protected String studentID;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    abstract String getCourseName();

    public Student(String name,String studentID){
        this.name=name;
        this.studentID=studentID;
    }
}
