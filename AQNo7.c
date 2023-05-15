#include <stdio.h>
#include<conio.h>


int main() {
   
int No1,No2;
int Sum;
printf("\n\n\nEnter 1st No?");
scanf("%d",&No1);
printf("Enter 2nd No?");
scanf("%d",&No2);
    printf("\n  Sum of %d and %d is\t\t:%d",No1,No2,No1+No2);
printf("\n  Product of %d and %d is\t\t:%d",No1,No2,No1*No2);
printf("\n  Difference between %d and %d is\t:%d",No1,No2,No1-No2);
printf("\n  Division of %d and %d is\t:%d",No1,No2,No1/No2);
printf("\n  Reminder of %d and %d is\t:%d",No1,No2,No1%No2);
printf("\n  ----------------------------------");

Sum=(No1+No2)+(No1*No2)+(No1-No2)+(No1/No2)+(No1%No2);

printf("\n  Total is\t\t\t:%d",Sum);




    return 0;
}
    