package forloop;
import java.util.Scanner;
public class pb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max2=0;
        int min2=0;
        int hot = 0, cold = 0;
        double max1 = 0,min1 = 0,total = 0;
        for(int i = 0;i<n;i++)
        {
            int hrs = sc.nextInt();
            double temp = sc.nextDouble();

            String status = "";
            if(temp >= 40 || temp < 0) status = "Extreme";
            else if(temp >= 32 && temp <= 40) {
                status = "Hot";
                hot++;
            }
            else if(temp >= 0 && temp < 10) {
                status = "Cold";
                cold++;
            }
            else if(temp >= 10 && temp < 32) status = "Normal";

            max1 = Math.max(max1, temp);
            max2 = Math.max(max2, hrs);

            min1 = Math.min(min1, temp);
            min2 = Math.min(max2, hrs);

            total +=temp;

            System.out.println("Hour "+hrs +":"+ temp+"C");
            System.out.println("Status: "+status);
           
        }
        System.out.println("Total Readings: "+n);
        System.out.println("Average temperature: "+(float)total/n);
        System.out.println("Highest Temperature: "+max1+"at Hour"+max2);
        System.out.println("Highest Temperature: "+min1+"at Hour"+min2);
        System.out.println("Hot Hours: "+hot);
        System.out.println("Cold Hours: "+cold);
    }
}
