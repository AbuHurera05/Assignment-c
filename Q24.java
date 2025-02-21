import java.util.Scanner;
class Q24{
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.print("\nInput any String?:");
String str= input.nextLine();
int count=1;
for (int i=0; i<str.length()-1; i++){
if (str.charAt(i)==' '){
count++;
    }
  }
System.out.println("Output:  The String has " +count+" words");

    }
}
