import java.util.Scanner;
class Q8 {
public static void main(String args[])
{
int area,radius;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter radius of the circle: ");
radius= sc.nextInt();
System.out.println("\nArea of circle is:  "+Math.PI*radius*radius);
}
}