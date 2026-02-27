#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    char itemName[50];
    double price;
    int quantity;

    double subtotal = 0;
    int totalItems = 0;

    for(int i = 0; i < N; i++) {
        scanf("%s %lf %d", itemName, &price, &quantity);

        double itemTotal = price * quantity;

        printf("Item: %s\n", itemName);
        printf("Price: $%.1lf x %d\n", price, quantity);
        printf("Subtotal: $%.1lf\n\n", itemTotal);

        subtotal += itemTotal;
        totalItems += quantity;
    }

    double tax = subtotal * 0.08;
    double serviceCharge = subtotal * 0.10;
    double grandTotal = subtotal + tax + serviceCharge;

    printf("Total Items: %d\n", totalItems);
    printf("Subtotal: $%.1lf\n", subtotal);
    printf("Tax (8%%): $%.2lf\n", tax);
    printf("Service Charge (10%%): $%.2lf\n", serviceCharge);
    printf("Grand Total: $%.2lf\n", grandTotal);

    return 0;
}