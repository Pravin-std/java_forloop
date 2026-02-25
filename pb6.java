package forloop;
import java.util.Scanner;
public class pb6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total bal:");
        double balance = sc.nextDouble();
        int i;
        int n = sc.nextInt();
        double sum =0;
        int success = 0,fail = 0;
        String rea = "";
        for(i=1;i<=n;i++)
        {
            double trans = sc.nextDouble();

            String sts = "";
            if(trans <= balance)
            {
                balance -= trans;
                sts = "Approved";
                success++;
                sum +=trans;

            }else{
                sts = "Denied";
                 rea = "Insufficient funds";
                fail++;
            }
            System.out.println("Transaction"+i+":"+trans);
            System.out.println("Status :"+sts);
            if(rea.equals("Insufficient funda"))
            {
                System.out.println("Reason :"+rea);
            }
            System.out.println("Remaining Balance: $"+balance);
            
        }

        System.out.println("Total Transactions :"+n);
        System.out.println("Successful Withdrawals: "+success);
        System.out.println("Failed Withdrawals: "+fail);
        System.out.println("Final Balance: $"+balance);
        System.out.println("Total Withdrawn: $"+sum);
    }
}
