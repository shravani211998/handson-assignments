public class MainBank1{
    public static void main(String args[]) {


        double amount = Double.parseDouble(args[0]);
        long sender = Long.parseLong(args[1]);
	    long receiver = Long.parseLong(args[2]);
	    

	    Account account1 = MainBank.getAccount(sender);
	    Account account2 = MainBank.getAccount(receiver);


	    if(account1 == null && account2 == null) 
            System.out.println("not valid account number");
        else{
		if(account1.getBalance() < amount) 
            System.out.println("Not enough amount !");
        else{
			account1.withdraw(amount);
			account2.deposit(amount);
			System.out.println("transferred!");
		}	
	}
		
    }

     
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();
	    for(Account acc : accounts){
		if(acc.getAccountNumber() == accountNo)
			return acc;
        }
	    return null;
        
    }
}