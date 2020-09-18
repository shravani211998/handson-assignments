public abstract class Employee extends Person{

    int emId;
    double salary;

    public Employee(String name, String gender, String dob, int phoneNo, Address address, int emId, double salary){
        super(name,gender,dob,phoneNo,address);
        this.emId = emId;
        this.salary = salary;
    }



    public void testDisplay(){

        super.testDisplay();
        
        System.out.println("Employee ID :"+emId+",Salary :"+this.salary);


    }









}