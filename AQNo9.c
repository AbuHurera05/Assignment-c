#include <stdio.h>
#include<conio.h>
int main() {
    int days, years, weeks, remainingDays;

    printf("\n\n\nEnter the number of days: ");
    scanf("%d", &days);

    years = days / 365;
    days = days % 365;

    weeks = days / 7;
    remainingDays = days % 7;

    printf("\n\tYears\tWeeks\tDays");
    printf("\n\t  %d\t  %d\t %d",years,weeks,days);

    return 0;
}