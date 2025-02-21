import java.util.Scanner;
class Q2 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double basicPay, houseRent,medicalAllownce,computerAllownce,sum;
System.out.print("\t\tPlease enter basic pay? ");
basicPay= sc.nextInt();
houseRent=basicPay*0.4;
medicalAllownce=basicPay*0.18;
computerAllownce=basicPay*0.15;
sum=basicPay+houseRent+medicalAllownce+computerAllownce;
System.out.println("\n\t\t\tPay Slip");
System.out.println("\t\tBasic Pay:\t\t"+basicPay);
System.out.println("\t\tHouse Rent(40%)\t\t"+houseRent);
System.out.println("\t\tMedical Allownce(18%):\t"+medicalAllownce);
System.out.println("\t\tComputer Allownce(15%):\t"+computerAllownce);
System.out.println("\t-----------------------------------------------");
System.out.print("\t\tTotal Pay:\t\t"+sum);

}
}