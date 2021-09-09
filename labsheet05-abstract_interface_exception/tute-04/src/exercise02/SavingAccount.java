package exercise02;

public class SavingAccount extends FixedDepositAccount{

    SavingAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        interest = balance * interestRate/100/12;
        return interest;
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("withdraw successfully !\nBalance is - "+balance);
    }


}
