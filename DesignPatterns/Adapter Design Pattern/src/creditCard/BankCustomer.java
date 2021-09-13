package creditCard;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {


    @Override
    public void giveBankDetails() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the Account holder name -");
        setAccHolderName(sn.nextLine());

        System.out.println("Enter Bank name -");
        setBankName(sn.nextLine());

        System.out.println("Enter account number -");
        setAccNumber(sn.nextLong());

    }

    @Override
    public String getCreditCard() {
        String name = getAccHolderName();
        long accNo = getAccNumber();
        String bName = getBankName();


        return ("The Account number " + accNo + " of " + name + " in " + bName + " bank is valid and authenticated for issuing the credit card. ");
    }
}
