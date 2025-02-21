class Q1  {
public static void main(String args[])
{
int i;
int Even=0,Odd=0;

System.out.println("\t    Even Number\t   Odd Number");
for (i=0;i<=9;i++) {
if (i%2==0){
System.out.print("\t\t"+i);
Even += i; }
if (i%2==1) {
System.out.print("\t\t"+i+"\n"); 
Odd +=i; } 

}
System.out.print("\n-----------------------------------------");
System.out.println("\nSum:\t\t"+Even+"\t\t"+Odd);


}
}