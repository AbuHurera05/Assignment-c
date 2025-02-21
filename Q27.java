import java.util.Scanner;
public class Q27 {
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("\t\t Use of Quadratic Equation");
double a,b,c;
System.out.println("Enter the value of a b c");
a=input.nextDouble();
b=input.nextDouble();
c=input.nextDouble();
System.out.println("Enter Value of a=" + a + "\tb=" + b + "\tc=" + c);
double discriminant=b*b-4*a*c;
if (discriminant>0) {
double PositiveRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
System.out.println("Positive root is:" + PositiveRoot);
double NegativeRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.println("Negative root is:" + NegativeRoot);
   }
else if (discriminant==0) {
double realRoot = -b / (2 * a);
System.out.println("One real root");
System.out.println("Real root" + realRoot);
  }
 else
System.out.println("No real roots.Complex root exist");

    }
}

