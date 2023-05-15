#include <stdio.h>

int main() {
    int seconds, hours, minutes,Seconds;

    printf("\n\n\nInput seconds? ");
    scanf("%d", &seconds);

    hours = seconds / 3600;
    seconds = seconds % 3600;

    minutes = seconds / 60;
    Seconds = seconds % 60;

    printf("\n\tHour\tMinutes\t  Seconds",hours,minutes,Seconds);
    printf("\n\t %d\t   %d  \t    %d",hours, minutes, Seconds);
    return 0;
}