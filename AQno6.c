#include <stdio.h>
#include<conio.h>


int main() {
   char Firstname[50];
char Lastname[50];
    int percentage;
    int Total;
    printf("\nPlease Enter Your name?");
    scanf("%s %s",&Firstname,Lastname);
    char First[50];
    
    printf("\nPlease Enter Your Seat No?");
    scanf("%s",&First);
    int a;
    printf("\nPlease Enter Marks of English?");
    scanf("%d",&a);
    int b;
    printf("\nPlease Enter Marks of Basic Electronics?");
    scanf("%d",&b);
    int c;
    printf("\nPlease Enter Marks of Methamatics?");
    scanf("%d",&c);
    int d;
    printf("\nPlease Enter Marks of Computer programing?");
    scanf("%d",&d);

    printf("\n\tM A R K S H E E T");
    printf("\nName:%s %s\t\tSeat No :%s ", Firstname,Lastname,First);
    printf("\n----------------------------------");
    printf("\nSubject\t\t\tMarks");
    printf("\n----------------------------------");
    printf("\n1. English\t\t:%d",a);
    printf("\n2. Basic Electronics\t:%d",b);
printf("\n3. Methamatics\t\t:%d",c);
printf("\n4. Computer Programing\t:%d",d);
printf("\n----------------------------------");
Total=a+b+c+d;
printf("\nTotal\t\t\t:%d",Total);
percentage=Total/400*100;
printf("\nPercentage\t\t:%d",percentage);
    return 0;
}
    