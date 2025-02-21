import java.util.Scanner;

class Q23{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int hexa=0, base=1;
System.out.print("\n\tEnter any binary number? ");
int binary = sc.nextInt();
while (binary>0) {
int  rem = binary % 10;
hexa = hexa + rem * base;
base = base * 2;
binary = binary / 10;
        }
System.out.println("\tHexaDecimal Number is:"+hexa);

    }
}
