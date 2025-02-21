import java.util.Scanner;
class Q11{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter any 10 integer Numbers : ");
int number= sc.nextInt();
int small=number;
int large= number;
for (int i=1;  i<10; i++){
 number= sc.nextInt();
if (number<small){
small= number;
            }
if (number>large){
large= number;
  }
     }
System.out.println("Largest Number : "+large);
System.out.println("Smallest Number : "+small);
    }
}

