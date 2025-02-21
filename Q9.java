import java.util.Scanner;
class Q9 {
    public static void main(String args[])
    {
        int sum1=0,sum2=0,sum3=0;
        int tableNo,start,Upto;
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\tEnter Table No: ");
        tableNo= sc.nextInt();
        System.out.print("\tStart From: ");
        start= sc.nextInt();

        System.out.print("\tUpto: ");
        Upto= sc.nextInt();



        System.out.println("\t\tTable No: "+tableNo);
        System.out.println(" \t");
        for(;start<=Upto;start++) {
            System.out.println("\t\t"+start+"  X  "+tableNo+"  =  "+start*tableNo);
            sum1=start+sum1;
            sum2=tableNo+sum2;
            sum3=+start*tableNo+sum3;
        }
        System.out.println("----------------------------------");
        System.out.println("  " +
                "" +
                "Sum= "+sum1+"    "+sum2+"    "+sum3);
    }
}