import java.util.Scanner;
class Q16 {
public static void main(String args[])
{
int start,Upto,n=0,s=0,q=0;
Scanner sc=new Scanner(System.in);
System.out.print("Start from.................? ");
start= sc.nextInt();
System.out.print("Up to......................? ");
Upto= sc.nextInt();
System.out.println("\tNumber\tSquare\tCube");
for(;start<=Upto;start++) {
System.out.print("\t"+start+"\t"+start*start+"\t"+start*start*start+"\n");
n=start+n;
s=start*start+s;
q=start*start*start+q;     }
System.out.println("=== =========================");
System.out.println("sum:\t"+n+"\t"+s+"\t"+q);
}
}