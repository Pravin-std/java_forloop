package forloop;
import java.util.Scanner;
public class pb4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalSales = 0;
        double totalCommissions = 0;
        double highestSales = 0;
        String topPerformer = "";

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double salesAmount = sc.nextDouble();

            int commissionRate = 0;
            double bonus = 0;


            if (salesAmount <= 40000)
                commissionRate = 5;
            else if (salesAmount <= 80000)
                commissionRate = 8;
            else if (salesAmount <= 100000)
                commissionRate = 10;
            else if (salesAmount <= 150000)
                commissionRate = 12;
            else
                commissionRate = 15;

         
            if (salesAmount >= 150000)
                bonus = 3000;
            else if (salesAmount >= 100000)
                bonus = 2000;

            double commission = salesAmount * commissionRate / 100;
            double totalPayout = commission + bonus;

            
            totalSales += salesAmount;
            totalCommissions += commission;

    
            if (salesAmount > highestSales) {
                highestSales = salesAmount;
                topPerformer = name;
            }

            
            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate: " + commissionRate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();
        }

        
        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);

        sc.close();
    }
}
