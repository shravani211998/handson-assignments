class ForEachDemo{
    public static void main(String[] args){

        SavingAccnt s1 = new SavingAccnt(1,"abc","mhs","nagpur");
        SavingAccnt s2 = new SavingAccnt(2,"xyz","bengal","ran");
        
        s1.deposit(1000);
        s1.display();
        s1.withdraw(100);
        s1.display();

        s2.deposit(2000);
        s2.display();
        s2.withdraw(100);
        s2.display();



       
    }

}










