public class Student extends Person{

    String grade;

    public Student(String name, String gender, String dob, int phoneNo, Address address,String grade){
        super(name,gender,dob,phoneNo,address);
        this.grade = grade;

    }

    public void testDisplay(){

        super.testDisplay();
        System.out.println("Salary :"+this.grade);


    }

    public void testUpdate(String grade){
        this.grade = grade;



    }






}