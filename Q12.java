import java.util.Scanner;
class Q12 {
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
int number1,number2,addition,product,Difference,Qoutient,Reminder,Total;
System.out.print("\nPlease Enter two numbers ?");
number1= input.nextInt();
number2= input.nextInt();
addition=number1+number2;
product=number1*number2;
Difference=number1-number2;
Qoutient=number1/number2;
Reminder=number1%number2;
Total=addition+product+Difference+Qoutient+Reminder;
System.out.println("Sum of "+number1+" and "+number2+" i:s\t\t"+addition);
System.out.println("Product of "+number1+" and "+number2+" is:\t\t"+product);
System.out.println("Difference of "+number1+" and "+number2+" is:\t"+Difference);
System.out.println("Qoutient of "+number1+" and "+number2+" is:\t\t"+Qoutient);
System.out.println("Reminder of "+number1+" and "+number2+" is:\t\t"+Reminder);
System.out.println("-------------------------------------------");

System.out.println("Total is:\t\t\t"+Total);



}
}
