package model;

public class BiologyStudent extends Student{
    public  String getCourseName(){
            return "Biology";
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
        public BiologyStudent(String name,String studentID){
            super (name,studentID);
        }
        @Override
        public String toString() {
            return "BiologyStudent{" +
                    "name='" + name + '\'' +
                    ", studentID='" + studentID + '\'' +
                    '}';
        }
    }


