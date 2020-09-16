class SavingAccnt{

int accntNo, pin;
String ifsc = "HSBC001";
double balance = 0.0;
String state, city, name;

void deposit(float i){
    balance = balance + i;
}

void withdraw(float j){
    balance = balance - j;

}

void display(){
   
    System.out.println("Account number : " + accntNo);
    System.out.println("IFSC :"+ifsc);
    System.out.println("State :"+state);
    System.out.println("City :"+city);
    System.out.println("Current balance is : "+balance);
}



SavingAccnt(int a, String n , String s , String c ){
    accntNo = a;
    name = n;
    state = s;
    city = c;

}








}