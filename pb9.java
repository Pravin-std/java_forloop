package forloop;
import java.util.Scanner;
public class pb9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int total = 0,total1 = 0;
    for(i=1;i<=n;i++)
    {
        sc.nextLine();
        String type = sc.nextLine();
        int min = sc.nextInt();

        int cal = 0;
        String intensity = "";
        if(type.equals("Running")) 
            {
                cal = min * 10;
                intensity = "High";
            }
        else if(type.equals("Swimming")){ 
            cal = min * 12;
            intensity = "High";
        }
        else if(type.equals("Cycling")) {
            cal = min * 8;
            intensity = "Moderate";
        }
        else if(type.equals("Gym")) {
            cal = min * 7;
            intensity = "Moderate";
        }
        else if(type.equals("Walking")){
             cal = min * 4;
             intensity = "Low";
        }

         total += min;
         total1 += cal;

         System.out.println("Session"+i+":"+type);
         System.out.println("Duration :"+min+"mintues");
         System.out.println("Calories :"+cal);
         System.out.println("Intensity:"+intensity);


    }
    String fitness = "";
    if(total1 < 300) fitness = "Beginner";
    else if(total1 >= 300 && total1 < 1000) fitness = "Intermediate";
    else if(total1 >= 1000) fitness = "Advanced";

    System.out.println("Total Workouts:"+n);
    System.out.println("Total Duration:"+total+"minutes");
    System.out.println("Total Calories Burned: "+total1);
    System.out.println("Average Calories per Session: "+total1/n);
    System.out.println("Fitness Level:"+fitness);
    }
    
}
