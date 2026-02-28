package forloop;
import java.util.Scanner;
public class pb14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0,km= 0;
        for(int i = 0;i<n;i++)
        {
            km = sc.nextDouble();
            sc.nextLine();
            String timeofday = sc.nextLine();

            double basefare = 3.0;

            double discharge = km * 1.0;

            double surcharge = 0.0;
            if(timeofday.equals("Morning")) surcharge = 0;
            else if(timeofday.equals("Afternoon")) surcharge = 0;
            else if(timeofday.equals("Evening")) surcharge = 3;
            else if(timeofday.equals("Night")) surcharge = 5;

            double total = basefare + discharge + surcharge;
            sum +=total;
            System.out.println("Ride "+i);
            System.out.println("Distance: "+km+"km");
            System.out.println("Time: "+timeofday);
            System.out.println("Base Fare: $"+basefare);
            System.out.println("Distance Charge: $"+discharge);
            System.out.println("Time Surcharge: $"+surcharge);
            System.out.println("Total Fare: $"+total);

        }
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+km+"km");
        System.out.println("Total Revenue: $"+sum);
        System.out.println("Average fare: $"+sum/n);
    }
}
