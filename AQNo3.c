#include <stdio.h>

int main() {
    int basicPay, houseRent, medicalAllowance, computerAllowance, totalPay;

   
    printf("\n\n\tPlease enter Basic pay: ");
    scanf("%d", &basicPay);

   
    houseRent = basicPay * 0.4; 
    medicalAllowance = basicPay * 0.18;
    computerAllowance = basicPay * 0.15;

    
    totalPay = basicPay + houseRent + medicalAllowance + computerAllowance;

    
    printf("\n\t\tPAY SLIP\n");
    printf("\tBasic pay \t\t:%d\n", basicPay);
    printf("\tHouse Rent (40%%) \t:%d\n", houseRent);
    printf("\tMedical Allowance (18%%) :%d\n", medicalAllowance);
    printf("\tComputer Allowance (15%%):%d\n", computerAllowance);
    printf("----------------------------------------\n");
    printf("Total pay \t\t\t:%d\n", totalPay);

    return 0;
}
    