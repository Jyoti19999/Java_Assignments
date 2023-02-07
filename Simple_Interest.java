import java.util.*;
class Simple_Interest
{
public static void main(String args[]){
int p,r,n;
Scanner sc = new Scanner(System.in);//Taking i/p from cammand line.
System.out.println("Enter the principle amount to calculate simple interest:");
p=sc.nextInt(); // The method will take integer input.
System.out.println("The entered principle amount is:" +p);
System.out.println("Enter the rate of interest to claculate SI:");
r=sc.nextInt();
System.out.println(" The entered rate of interest is "+r);
System.out.println("Enter the no.of years for calculate SI:");
n=sc.nextInt();
System.out.println("The entered no. of years for SI "+n);
int d=((p*r*n)/100); // formula to calculate SI
System.out.println("As per the entered values simple interest(SI) is: "+d);
}
}
