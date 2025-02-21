import java.util.Scanner;
class Q22 {
public static void main(String args[])
{
int num,reversed=0,digit;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any Number: ");
num= sc.nextInt();
System.out.print("Reversed of "+num+"is: ");
for(;num!=0;num/=10) {
digit=num % 10;
reversed=reversed*10+digit;

}
System.out.print(reversed);
}
}
