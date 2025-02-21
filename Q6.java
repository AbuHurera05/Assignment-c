import java.util.Scanner;
class Q6 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter Amount:   ");
int amount= sc.nextInt();

int note1=amount/1000;
amount=amount%1000;
int note2=amount/500;
amount=amount%500;
int note3=amount/100;
amount=amount%100;
int note4=amount/50;
amount=amount%50;
int note5=amount/20;
amount=amount%20;
int note6=amount/10;
amount=amount%10;
int note7=amount/5;
amount=amount%5;
int note8=amount/2;
amount=amount%2;
int note9=amount/1;

System.out.println("\n1000\t500\t100\t50\t20\t10\t5\t2\t1");
System.out.println(note1+"\t"+note2+"\t"+note3+"\t"+note4+"\t"+note5+"\t"+note6+"\t"+note7+"\t"+note8+"\t"+note9+"\t");
}
}
