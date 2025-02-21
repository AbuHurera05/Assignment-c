import java.util.Scanner;
class Q20  {
public static void main(String args [])
{
int number,number1,number2,number3,number4,number5,sum;
Scanner input= new Scanner(System.in);
System.out.print("\n\tPlease enter five-digit number ?");
number= input.nextInt();
number1= number%10;
number=number/10;
number2= number%10;
number= number/10;
number3= number%10;
number= number/10;
number4= number%10;
number= number/10;
number5= number%10;
sum=number1+number2+number3+number4+number5;
System.out.println("\n\tSeparated from one another by three spaces: "+number5+"   "+number4+"   "+number3+"   "+number2+"  "+number1);
System.out.println("\tSum of five digits: "+sum);

}
}