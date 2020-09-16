class Employee{
    int id ; 
    String name;
    double salary;
    Address ad;
    
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;


    }

    Employee(int id, String name, double salary, Address ad){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ad = ad;

    }

   
    void display(){

        System.out.println("Id = "+this.id+", Name = "+this.name+", Salary = "+this.salary+"Address = "+ad);



    }






}