import java.util.Scanner;
class Q10 {
public static void main(String args[])
{
int second,minutes,hour;
Scanner sc=new Scanner(System.in);
System.out.print("\nInput Seconds = ");
second= sc.nextInt();
hour=second/3600;

minutes=(second%3600)/60;
int seconds=second%60;
System.out.println("\tHours\tMinutes\tSeconds");
System.out.println("\t  "+hour+"\t   "+minutes+"\t   "+seconds);
}
}