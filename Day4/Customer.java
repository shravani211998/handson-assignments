public class Customer extends Person{
    Account account;

  

    public Customer(String name, String gender, String dob, int phoneNo, Address address, Account account){
        super(name,gender,dob,phoneNo,address,account);
        

    }



    public void testDisplay(){

        super.testDisplay();
        

    }

    public void testUpdate(int amount){
        account.setBalance(amount);



    }









}