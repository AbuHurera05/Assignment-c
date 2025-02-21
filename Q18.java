import java.util.Scanner;
class Q18 {
public static void main(String args[])
{
int N1,N2,tam;

Scanner sc=new Scanner(System.in);
System.out.print("\nEnter value of N1: ");
N1= sc.nextInt();
System.out.print("Enter value N2: ");
N2= sc.nextInt();
tam=N1;
N1=N2;
N2=tam;
System.out.print("\t\tValue of N1 is:  "+N1);
System.out.println("\n\t\tValue of N2 is:  "+N2);
}
}