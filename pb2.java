package forloop;
import java.util.Scanner;
public class pb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int count = 0,count1 = 0;
        int sum = 0;
        String status = "Pass";
        int max = 0;
        for(i=1;i<=n;i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            int score = sc.nextInt();
            char grade = 'A';
            if(score >=85 && score <=100) grade = 'A';
            else if(score >=70 && score <= 84) grade = 'B';
            else if(score >= 60 && score <= 69) grade = 'C';
            else if(score >= 50 && score <= 59) grade = 'D';
            else grade = 'F';

        
            if(score >= 60) 
                {
                    status = "Pass";
                    count++;
                }
            else 
            { 
            status = "Fail";
            count1++;
            }

            sum += score;
            max = Math.max(max, score);
            System.out.println("Student :"+name);
            System.out.println("Score :"+score);
            System.out.println("Letter Grade :"+grade);
            System.out.println("Status :"+status);
        }
    double avg = sum / n;

    System.out.println("Total Students: "+n);
    System.out.println("Class Average: "+avg);
    System.out.println("Highest Score: "+max);
    System.out.println("Students Failed: "+count1);


    }
}
