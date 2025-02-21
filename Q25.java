import java.util.Scanner;
class Q25{
public static void main(String[] args) {
int i=0, carry=0;
Scanner sc= new Scanner(System.in);
System.out.print("\nInput Data:\nInput first binary number: ");
Long b1= sc.nextLong();
System.out.print("Input second binary number: ");
Long b2= sc.nextLong();
int[] sum= new int[10];
while(b1 !=0 || b2!= 0) {
sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
 carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
 b1 = b1 / 10;
b2 = b2 / 10;
}
if (carry!=0){
sum[i++]= carry;
}
  --i;
System.out.print("Expected Output:\n\nSum of two binary numbers : ");
while(i>=0){
System.out.print(sum[i--]);
}
System.out.print("\n");
        }
    }
