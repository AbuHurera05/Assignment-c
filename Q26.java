import java.util.Scanner;
class Q26{
public static void main(String[] args) {
int l,i;
String reverse="";
Scanner sc= new Scanner(System.in);
System.out.print("Input a Name: ");
String input= sc.next();
l=input.length();
for (i=l-1; i>=0; i--){
reverse=reverse+input.charAt(i);
  }
System.out.println("Reverse Name: "+reverse);
    }
}
