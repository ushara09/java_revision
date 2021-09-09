package exercise02;

public class FixedDepositAccount extends Account {

    protected double interestRate, interest;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    FixedDepositAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        interest = balance * interestRate / 100;
        return interest;
    }
}
