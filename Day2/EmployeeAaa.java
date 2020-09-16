class EmployeeAaa{

    public static void main(String[] args){
        Employee e[] = new Employee[5];



        e[0] = new Employee(1,"xyz",6000); 
        e[1] = new Employee(2,"pqr",2000);
        e[2] = new Employee(3,"ghj",5000);
        e[3] = new Employee(4,"asd",4000);
        e[4] = new Employee(5,"bnm",8000);

        for(int i=0 ; i<e.length ; i++){
            if(e[i].salary > 5000){
             e[i].display();
            }


        }   
    }




}