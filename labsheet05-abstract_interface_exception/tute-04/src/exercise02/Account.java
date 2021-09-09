package exercise02;

public abstract class Account {
    protected String accountNo, name;
    protected double balance;

    Account(String accNo, String name, double balance){
        this.accountNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("Deposit successfully !");
        System.out.println("Balance is - "+balance);
    }

    public void display(){
        System.out.println("Name -"+this.name);
        System.out.println("Account No -"+this.accountNo);
        System.out.println("Balance - "+this.balance);
    }

}
