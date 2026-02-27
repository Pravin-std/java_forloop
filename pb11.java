#include <stdio.h>
#include <string.h>

int main() {
    int N;
    scanf("%d", &N);

    char seatType[20], customerType[20];

    double originalTotal = 0;
    double finalTotal = 0;

    for(int i = 0; i < N; i++) {
        scanf("%s %s", seatType, customerType);

        double basePrice = 0;
        double discountPercent = 0;

        if(strcmp(seatType, "Regular") == 0)
            basePrice = 12;
        else if(strcmp(seatType, "Premium") == 0)
            basePrice = 18;
        else if(strcmp(seatType, "Recliner") == 0)
            basePrice = 25;

        if(strcmp(customerType, "Child") == 0)
            discountPercent = 30;
        else if(strcmp(customerType, "Senior") == 0)
            discountPercent = 25;
        else
            discountPercent = 0;

        double finalPrice = basePrice * (1 - discountPercent / 100);

        printf("Ticket %d: %s - %s\n", i + 1, seatType, customerType);
        printf("Base Price: $%.1lf\n", basePrice);
        printf("Discount: %.0lf%%\n", discountPercent);
        printf("Final Price: $%.1lf\n\n", finalPrice);

        originalTotal += basePrice;
        finalTotal += finalPrice;
    }

    int groupApplied = 0;

    if(N >= 5) {
        finalTotal = finalTotal * 0.90;
        groupApplied = 1;
    }

    double totalDiscount = originalTotal - finalTotal;

    printf("Total Tickets: %d\n", N);
    printf("Original Total: $%.1lf\n", originalTotal);
    printf("Total Discount: $%.1lf\n", totalDiscount);
    printf("Final Total: $%.1lf\n", finalTotal);

    if(groupApplied)
        printf("Group Discount Applied: Yes\n");
    else
        printf("Group Discount Applied: No\n");

    return 0;
}