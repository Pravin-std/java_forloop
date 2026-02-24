import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalRateSum = 0;
        double highestRate = 0;
        int peakDay = 0;
        int fullCapacityDays = 0;

        for (int i = 0; i < N; i++) {
            int day = sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();

            double occupancyRate = (roomsOccupied * 100.0) / totalRooms;

            String status;

            if (occupancyRate == 100)
                status = "Full";
            else if (occupancyRate >= 80)
                status = "High";
            else if (occupancyRate >= 60)
                status = "Moderate";
            else
                status = "Low";

        
            totalRateSum += occupancyRate;


            if (occupancyRate > highestRate) {
                highestRate = occupancyRate;
                peakDay = day;
            }

    
            if (occupancyRate == 100)
                fullCapacityDays++;

            
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + occupancyRate + "%");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double averageRate = totalRateSum / N;

    
        System.out.println("Total Days Analyzed: " + N);
        System.out.println("Average Occupancy Rate: " + averageRate + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullCapacityDays);

        sc.close();
    }
}