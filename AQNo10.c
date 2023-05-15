#include <stdio.h>

int main() {
    int N1, N2, temp;

    printf("\n\n\nEnter value of N1? ");
    scanf("%d", &N1);
    printf("Enter value of N2? ");
    scanf("%d", &N2);

    temp = N1;
    N1 = N2;
    N2 = temp;
    printf("\n\tValue of N1 is :%d",N1);
    printf("\n\tValue of N1 is :%d",N2);
    

    return 0;
}