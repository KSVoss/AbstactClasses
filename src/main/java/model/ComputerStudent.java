package model;

public class ComputerStudent extends  Student implements  Citizen{
    public  String getCourseName(){
        return "ComputerScience";
    }
    public  String getAdress(){
        return  this.adress;
    }
    public  String getIdentityCardNumber(){
        return this.identityCardNumber;
    }

    public void setAdress(String adress){
        this.adress=adress;
    }
    public void setIdentityCardNumber(String identityCardNumber){
        this.identityCardNumber=identityCardNumber;
    }
    public ComputerStudent(String name,String studentID){
        super (name,studentID);
    }
    @Override
    public String toString() {
        return "ComputerStudent{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
