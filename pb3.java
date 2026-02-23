package forloop;
import java.util.Scanner;
public class pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        String status = "";
        int rec = 0;
        int count = 0;
        int total = 0;
        int low= 0,cri = 0;
        for(i=0;i<n;i++)
        {
            sc.nextLine();
            String pro = sc.nextLine();
            int cur_stock = sc.nextInt();
            int min_stock = sc.nextInt();

            if(cur_stock >= min_stock)
            {
                status = "Adequate";
            }else if(cur_stock < min_stock && cur_stock >= min_stock/2)
            {
                status = "Low Stock";
                low++;
            }else if(cur_stock < min_stock)
            {
                status = "Critical";
                cri++;
            }
            if(status.equals("Adequate")) rec = 0;
            else if(status.equals("Low stock")) 
                {
                    rec = (min_stock - cur_stock) + min_stock/2;
                     count++;
                }
            else if(status.equals("Critical")) rec = (min_stock - cur_stock) + min_stock * (int)1.5;

            System.out.println("Product: "+pro);
            System.out.println("Current Stock: "+cur_stock);
            System.out.println("Minimum Stock: "+min_stock);
            System.out.println("Status: "+status);
            System.out.println("Reorder Quantity: "+rec);

            total +=rec;
        }
        System.out.println("Total Products: "+n);
        System.out.println("Low Stock Items: "+low);
        System.out.println("Critical items :"+cri);
        System.out.println("Total Reorder Quantity: "+total);

    }
}
