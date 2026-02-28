package forloop;
import java.util.Scanner;
public class pb12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0, count2 = 0;
        for(int i = 0;i<n;i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            String status = "Not Eligible";
            if(age >= 18 && age <= 65)
            {
                if (weight >= 50)
                {
                     if(hemoglobin >=12.5)
                    {
                        status = "Eligible";
                    }
                }
            }

            String reason = "";

            if(age < 18)
            {
                reason = "Age is below 18";
            }else if(weight < 50)
            {
                reason = "weight is below 50";
            }else if(hemoglobin < 12.5)
            {
                reason = "Hemoglobin below 12.5 g/dL";
            }

            if(status.equals("Eligible"))
            {
                count1++;
            }else
            {
                count2++;
            }


            System.out.println("Donor: "+name);
            System.out.println("Age: "+age);
            System.out.println("Weight: "+weight);
            System.out.println("Hemoglobin: "+hemoglobin);
            System.out.println("Status: "+status);
            System.out.println("Reason: "+reason);

        }
        double rate = (count1 / n) * 100.0;
        System.out.println("Total Donors: "+n);
        System.out.println("Eligible Donors: "+count1);
        System.out.println("Rejected Donors: "+count2);
        System.out.println("Eligibility Rate: "+rate+"%");
    }
}
