class Account{

    int accountNo;
    double accountBalance;

    Account(int accountNo, double accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;

    }

    public void setBalance(int amount) {
		this.accountBalance = amount;
	}


}