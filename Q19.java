import java.util.Scanner;
class Q19 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int decimal,temp,module;
System.out.print("\n\tEnter any Decimal Number: ");
decimal=sc.nextInt();
String binary="";
temp=decimal;
while (temp>0) {
module= temp%2;
temp=temp/2;
binary=module+binary;
        }
        System.out.println("\tEquivalent binary value of decimal number "+decimal+" : "+binary );
    }
}
