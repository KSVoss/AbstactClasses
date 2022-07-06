package model;

import java.util.HashMap;

public class StudentDB {
    HashMap<String, Student> students=new HashMap<>();

    public void addStudent(Student student){
        students.put(student.studentID,student);
    }

    public Student getStudent(String studentID){
        return students.get(studentID);
    }

    public  String toString(){
        String returnValue="";
        for(String key : students.keySet()){
            returnValue+=key+" "+students.get(key)+'\n';

        }
        return returnValue;
    }

    /*
    public Student randomStudend

     */



}



