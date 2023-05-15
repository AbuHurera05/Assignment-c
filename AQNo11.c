#include <stdio.h>

int main() {
    int num, digit, sum = 0;
    printf("\n\n\nPlease enter a five-digit number: ");
    scanf("%d", &num);
    printf("\nSeparated from one an other by three spaces: ");
    
    digit = num / 10000;
    printf("%d   ", digit);
    sum += digit;

    digit = (num % 10000) / 1000;
    printf("%d   ", digit);
    sum += digit;

    digit = (num % 1000) / 100;
    printf("%d   ", digit);
    sum += digit;

    digit = (num % 100) / 10;
    printf("%d   ", digit);
    sum += digit;

    digit = num % 10;
    printf("%d\n", digit);
    sum += digit;

    
    printf("Sum of digits = %d\n", sum);
    return 0;
}