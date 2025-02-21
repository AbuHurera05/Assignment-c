import java.util.Scanner;
class Q29{
public static void main(String[] args) {
Scanner user_input= new Scanner(System.in);
int no_of_days=0;
String month_name="Unknown";
System.out.print("\nTest Data\nInput a month number :");
int month= user_input.nextInt();
System.out.print("Enter Year:");
int year =user_input.nextInt();
switch (month) {
case 1:
month_name = "January";
no_of_days = 31;
break;
case 2:
month_name ="February";
if((year%400==0) || ((year%4==0) && (year%100!=0))) {
no_of_days = 29;
}
else
no_of_days= 28;
break;
case 3:
month_name = "March";
no_of_days = 31;
break;
case 4: month_name= "April"; no_of_days=30;
break;
case 5: month_name= "May"; no_of_days=31;
break;
case 6: month_name= "June"; no_of_days=30;
break;
case 7: month_name= "July"; no_of_days=31;
break;
case 8: month_name= "August"; no_of_days=31;
break;
case 9: month_name= "September"; no_of_days=30;
break;
case 10: month_name= "October"; no_of_days=31;
break;
case 11: month_name= "November"; no_of_days=30;
break;
case 12: month_name= "December"; no_of_days=31;
break;

}
System.out.println("Expected Output:  "+month_name +" "+ year+" has "+no_of_days+ " days\n");
}
}
