package forloop;
import java.util.Scanner;
public class pb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double total = 0;
        for(int i = 1;i<=n;i++)
        {
            sc.nextLine();
             String name = sc.nextLine();
             double salary = sc.nextDouble();
             int rate = sc.nextInt();

             int per = 0;
             if(rate == 5) per = 15;
             else if(rate == 4) per = 10;
             else if(rate == 3) per = 5;
             else if(rate == 2) per = 2;
             else if(rate == 1) per = 0;

             double final_sal = salary * (1+per/100.0);
             sum++;
             total +=final_sal;

            System.out.println("Employee:"+name);
            System.out.println("Base Salary: $"+salary);
            System.out.println("Performance Rating:"+per+"%");
            System.out.println("Final Salary: $"+final_sal);
        }
        double avg = total/sum;
        System.out.println("Total Employees Processed:"+sum);
        System.out.println("Total Payroll: $"+total);
        System.out.println("Average Salary: $"+avg);
        
    }
}
