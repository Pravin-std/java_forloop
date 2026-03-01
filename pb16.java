package forloop;
import java.util.Scanner;
public class pb16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0,total = 0;
        double avg = 0;
        for(int i = 0;i<n;i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String mem = sc.nextLine();
            int days = sc.nextInt();

            int fee = 0;
            if(mem.equals("Basic")) fee =  50;
            else if(mem.equals("Premium")) fee =  100;
            else if(mem.equals("VIP")) fee =  200;

            int dis = 0;
            if(days >= 45) dis = 20;
            else if(days >= 30 && days <= 44) dis = 15;
            else if(days >= 15 && days <= 29) dis = 10;
            else if(days <= 15) dis = 0;

            String priority = "";
            if(days < 10) {
                priority = "Urgent";
                count++;
            }
            else if(days >= 10 && days < 30) priority = "High";
            else if(days >= 30) priority = "Normal";

            double final_fee = fee * (1 - dis / 100.0);
            total +=final_fee;

            System.out.println("Member: "+name);
            System.out.println("Membership: "+mem);
            System.out.println("Days Until Expiry: "+days);
            System.out.println("Renewal Fee: $"+fee);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Final Fee: $"+final_fee);
            System.out.println("Priority: "+priority);

        }
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+count);
        System.out.println("Total Renewal Revenue: $"+total);
        System.out.println("Average Renewal Fee: $"+total/n);
    }
}
