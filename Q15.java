import java.util.Scanner;
class Q15{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int days,year,week;
System.out.print("Enter number of Days?");
days= sc.nextInt();
year=days/365;
days=days%365;
week= days/7;
days=days%7;
System.out.println("Years\t\tWeeks\t\tDays");
System.out.printf(year+"\t\t"+week+"\t\t"+days);
    }
}
