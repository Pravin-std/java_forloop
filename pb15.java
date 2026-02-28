package forloop;
import java.util.Scanner;
public class pb15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pass = 0, fail = 0,max = 0;
        double sum = 0;
        for(int i = 0;i<n;i++)
        {
            sc.nextLine();
            String Name = sc.nextLine();
            int crt = sc.nextInt();
            int wrg = sc.nextInt();
            int unampt = sc.nextInt();

            int score = (crt * 4) - (wrg * 3) + (unampt * 0);

            String Res = "";
            if(score >= 32)
            {
                Res = "Pass";
                pass++;
            }else
            {
                Res = "Fail";
                fail++;
            }

            max = Math.max(max, score);
            sum +=score;

            System.out.println("Student: "+Name);
            System.out.println("Correct: "+crt);
            System.out.println("Wrong: "+wrg);
            System.out.println("Unattempted: "+unampt);
            System.out.println("Score: "+score);
            System.out.println("Result: "+Res);
        }

        System.out.println("Total Student: "+n);
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail count: "+fail);
        System.out.println("Class Avgerage: "+sum/n);
        System.out.println("Highest Score: "+max);
    }
}
