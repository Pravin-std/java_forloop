package forloop;
import java.util.Scanner;
public class pb19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double depo = 0.0,with = 0.0,trans = 0.0,pay = 0.0,total = 0.0;
        for(int i = 1;i<=n;i++)
        {
            sc.nextLine();
            String type = sc.nextLine();
            double amt = sc.nextDouble();
            sc.nextLine();
            String cat = sc.nextLine();

            if(type.equals("Deposit")) depo += amt;
            else if(type.equals("Withdrawal")) with += amt;
            else if(type.equals("Transfer")) trans  +=amt;
            else if(type.equals("Payment")) pay += amt;


            System.out.println("Transaction"+i+":"+type);
            System.out.println("Amount: $"+amt);
            System.out.println("Category: "+cat);


        }
        total = with + trans + pay;
        System.out.println("Total Transaction: "+n);
        System.out.println("Total Deposits: $"+depo);
        System.out.println("Total Withdrawals: $"+with);
        System.out.println("Total Transfers: $"+trans);
        System.out.println("Total Payment: $"+pay);
        System.out.println("Net Balance Change: $"+(depo - total));
    }
}
