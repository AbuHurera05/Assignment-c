import java.util.Scanner;
class Q14 {
public static void main(String args[])
{
int no1,no2,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter 1st number= ");
no1= sc.nextInt();
System.out.print("Enter 2nd number= ");
no2= sc.nextInt();
System.out.print("Sum:  ");
for(;no1<=no2;no1++){
System.out.print(no1+"+");
sum=sum+no1;
}
System.out.println("="+sum);
}
}