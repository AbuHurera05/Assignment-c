#include <stdio.h>
#include<conio.h>
int main() {
    int amount;
    printf("\n\nEnter any amount: ");
    scanf("%d", &amount);

    

    int count500 = amount / 500;
    amount %= 500;
    int count100 = amount / 100;
    amount %= 100;
    int count50 = amount / 50;
    amount %= 50;
    int count20 = amount / 20;
    amount %= 20;
    int count10 = amount / 10;
    amount %= 10;
    int count5 = amount / 5;
    amount %= 5;
    int count2 = amount / 2;
    amount %= 2;
    int count1 = amount;

    printf("\n\t500 100 50 20 10  5  2  1\n");
    printf("\t %d   %d   %d  %d  %d  %d  %d  %d\n", count500, count100, count50, count20, count10, count5, count2, count1);

    return 0;
}
