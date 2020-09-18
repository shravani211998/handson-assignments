public class Main{
    public static void main(String[] args){
        

        Address managerAd = new Address("maharashtra","nagpur",1234);
        Address studentAd = new Address("karnataka","xyz",5767);
        Address progAd = new Address("tamilNadu","dfg",4355);
        Address adminAd = new Address("goa","hjk",8907);
        Address customerAd = new Address("bengal","try",2945);

        Account customerAc = new Account(12132,36727d);

        Manager manager = new Manager("qwewr","female","2/4/1992",12252637,managerAd,4,100000d);
        Student student = new Student("gfcsg","male","5/2/2000",6327673,studentAd,"A+");
        Programmer prog = new Programmer("gdjhj","female","7/11/1995",263725472,progAd,5,50000d);
        Admin admin = new Admin("nkjji","male","1/8/1999",252376,adminAd,6,100000d);
        Customer customer = new Customer("gdvfhdb", "female", "3/3/1993", 43546376, customerAd,customerAc);

        

        manager.testDisplay();
        student.testDisplay();
        prog.testDisplay();
        admin.testDisplay();
        customer.testDisplay();

        customer.testUpdate(1000);
        customer.testDisplay();

        student.testUpdate("O");
        student.testDisplay();
        







    }








}