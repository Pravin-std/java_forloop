package forloop;
import java.util.Scanner;
public class pb7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum = 0,total = 0;
        for(i=1;i<=n;i++)
        {
            sc.nextLine();
            String con_id = sc.nextLine();
            int units = sc.nextInt();

            double bill = 0;
            if(units <= 100) bill= 0.10;
            else if(units >=101 && units <= 200) bill = 0.13;
            else if(units >= 201 && units <= 300) bill = 0.16;
            else if(units > 300) bill = 0.20;

            double cost = units * bill;
            sum +=units;
            total +=cost;

            String cat = "";
            if(units <= 200) cat = "Low Usage";
            else if(units >=201 && units <= 300) cat = "Medium Usage";
            else if(units > 300) cat = "High Usage";

            System.out.println("Consumer ID: "+con_id);
            System.out.println("Units Consumed: "+units);
            System.out.println("Bill Amount: $"+(float)cost);
            System.out.println("Category: "+cat);
        }

        System.out.println("Total Consumers: "+n);
        System.out.println("Total Units Consumed: "+sum);
        System.out.println("Total Revenue: $"+total);
        System.out.println("Average Bill: $"+total/n);
    }
}
