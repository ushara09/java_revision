package electricityBill;

import java.util.Scanner;

public class GenerateBill {

    public static void main(String args[]){
        System.out.println("Enter the name of the plan that wanted to generate a bill :");

        Scanner sn = new Scanner(System.in);
        String plan = sn.nextLine();

        System.out.println("Enter the number of units for calculate in bill :");
        int units = sn.nextInt();

        GetPlanFactory factory = new GetPlanFactory();
        Plan p = factory.getPlan(plan);


        System.out.print("Bill amount for "+plan+" of "+units+" units is : ");
        p.getRate();
        p.calculateBill(units);


    }

}
