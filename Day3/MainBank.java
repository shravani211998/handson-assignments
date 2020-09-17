public class MainBank {
    public static void main(String[] args) {
        //pass the accountNo and amount to deposit from CLA
        long accountNO = Long.parseLong(args[0]);
        double amount = Double.parseDouble(args[1]);
        //get the Account using the accountNo by calling getAccount(...)
        Account accnt = MainBank.getAccount(accountNO);
  
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit

        if(accnt != null){
            accnt.accountInformation();
            accnt.deposit(amount);
            accnt.accountInformation();
        }
        else{
            System.out.println("Account not found");
            }
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();

        //Account account = null;
        // get the account from accounts using the accountNo

        for(Account a : accounts){
            if(a.getAccountNumber() == accountNo){
                return a;
            }
        }

        return null;
    }
}