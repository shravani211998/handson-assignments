public abstract class Person{
    String name, gender, dob;
    int phoneNo;
    Address address;
    Account account;

    public Person(String name, String gender, String dob, int phoneNo){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNo = phoneNo;

    }

    public Person(String name, String gender, String dob, int phoneNo, Address address){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.address = address;

    }

    public Person(String name, String gender, String dob, int phoneNo, Address address, Account account){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.address = address;
        this.account = account;


    }


    public void testDisplay(){

        
        System.out.println("Name :"+this.name+",Gender :"+this.gender+",Date of birth"+this.dob+",Phone no:"+this.phoneNo+",Address :"+this.address);

    }

    
















}