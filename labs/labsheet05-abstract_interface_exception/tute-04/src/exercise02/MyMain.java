package exercise02;

public class MyMain {
    public static void main(String args[]){
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("acc123","ushara",1000.00);
        fixedDepositAccount.deposit(500.00);

        System.out.println("=============================================");

        SavingAccount savingAccount = new SavingAccount("acc567","geekiyanage",1500.00);
        savingAccount.deposit(500.00);
        savingAccount.withdraw(1000.00);
    }
}
