package forloop;
import java.util.Scanner;
public class pb8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int tot_quan = 0;
        double total = 0, finaltotal = 0, totaldis = 0, sav = 0;
        for(i=1;i<=n;i++)
        {
            sc.nextLine();
            String product = sc.nextLine();
            double price = sc.nextDouble();
            int quan = sc.nextInt();

            int dis = 0;
            if(quan <=1) dis = 0;
            else if(quan >=2 && quan <=4) dis = 10;
            else if(quan >=5 && quan <=9) dis = 15;
            else if(quan >=10) dis = 20;

            double subtotal = price * quan * (1 - dis/100.0);

             total += price * quan;
             finaltotal +=subtotal;

             tot_quan +=quan;

            System.out.println("Product: "+product);
            System.out.println("Unit Price: $"+price);
            System.out.println("Quantity: "+quan);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Subtotal: $"+subtotal);
        }
        totaldis = total - finaltotal;
        sav = (totaldis / total) * 100.0;

        System.out.println("Total Items: "+tot_quan);
        System.out.println("Original Total: $"+total);
        System.out.println("Total Discount: $"+totaldis);
        System.out.println("Final Total: $"+(total-totaldis));
        System.out.println("Savings: "+(float)sav);
    }
}