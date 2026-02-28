package forloop;
import java.util.Scanner;
public class pb13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0,count = 0;
        for(int i = 0;i<n;i++)
        {
            sc.nextLine();
            String booktype = sc.nextLine();
            int dayslate = sc.nextInt();

            double fine = 0.0;
            if(booktype.equals("Regular"))
            {
                fine = 0.50;
            }else if(booktype.equals("Reference"))
            {
                fine = 1.00;
            }else if(booktype.equals("Magazine"))
            {
                fine = 0.25;
            }

            

            double cal_fine = dayslate * fine;
             sum += cal_fine;
            double min = Math.min(cal_fine, (dayslate*fine));

            String cap = "";
            if(cal_fine != min)
            {
                cap = "Yes";
            }else
            {
                cap = "No";
            }

           
            if(dayslate > 0)
            {
                count++;
            }

            System.out.println("Book"+i+":"+booktype);
            System.out.println("Days Late: "+dayslate);
            System.out.println("Daily Fine: $"+fine);
            System.out.println("Calculated Fine: $"+cal_fine);
            System.out.println("Actual Fine: $"+min);
            System.out.println("Cap Applied: "+cap);

        }

        System.out.println("Total Books: "+n);
        System.out.println("Total Fines Collected : $"+sum);
        System.out.println("Books Overdue: "+count);
        System.out.println("Average Fine: $"+(sum/n));
    }
}
