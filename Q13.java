import java.util.Scanner;
class Q13{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int reminder, octal=0, base=1;
System.out.print("Enter any binary number :");
int number = sc.nextInt();
while(number >0) {
reminder = number % 10;
octal = octal + reminder * base;
base = base * 2;
number = number / 10;
   }
   System.out.printf("Octal Number is %o : ",octal);
  }
}

