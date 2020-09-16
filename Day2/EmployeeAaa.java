class EmployeeAaa{

    public static void main(String[] args){
        Employee e[] = new Employee[5];
        Address ad1 = new Address("maharashtra","nagpur",123);
        Address ad2 = new Address("tamilNadu","dfg",456);



        e[0] = new Employee(1,"xyz",6000,ad1); 
        e[1] = new Employee(2,"pqr",2000);
        e[2] = new Employee(3,"ghj",5000);
        e[3] = new Employee(4,"asd",4000);
        e[4] = new Employee(5,"bnm",8000,ad2);

        for(Employee ep : e){
            if(ep.salary > 5000){
             ep.display();
            }


        }  

        
    }




}