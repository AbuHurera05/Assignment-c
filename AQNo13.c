#include <stdio.h>

int main() {
    int number, reverse = 0;

    printf("\n\n\nEnter any number: ");
    scanf("%d", &number);
    printf("\nReverse of %d is:",number);
    while (number != 0) {
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number /= 10;
    }

    printf(" %d\n",reverse);

    return 0;
}
