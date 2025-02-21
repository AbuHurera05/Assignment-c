import java.util.Scanner;
class Q5 {
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int length,width; 
System.out.print("Enter length of Rectangular: ");
length= sc.nextInt();
System.out.print("\nEnter width of Rectangular: ");
width= sc.nextInt();
System.out.println("\nArea of the rectangular is:  "+length*width);
}
}