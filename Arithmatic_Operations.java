import java.util.*;
class Arithmatic_Operations
{ public static void main(String args[])
{

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number1");
      int num1= sc.nextInt();
    System.out.println("Enter number2");
      int num2=sc.nextInt();
    
  int addition=num1+num2;
  int subtraction=num1-num2;
  int multiplication=num1*num2;
  int division=num1/num2;
  int modulus=num1%num2;

 System.out.println("The addition is :  " +addition);
 System.out.println("The subtraction is:  " +subtraction);
 System.out.println("The multiplication is:  " +multiplication);
 System.out.println("The division is:  "+division);
 System.out.println("The modulus is:  " +modulus);
   int x=num1;
    int y=num2;
System.out.println("The number1 before perfomring increment operation is: "+num1);
int b=++num1;
System.out.println("The number1 after pre-increment(++num1) is: "+b);
int c=num1++;
System.out.println("The number1 after post-increment is: "+c);
System.out.println("The addition of  numbers(++num1)  is :"+(x+b));
System.out.println("The addition of  numbers (num1++) is :"+(x+c));
System.out.println("number2 is :"+num2);

int predecrement=--num2;
System.out.println("The number2 after (--num2) is: "+predecrement );
int postdecrement=num2--;
System.out.println("The number2 after(num--) is: "+postdecrement );
System.out.println("The subtraction of numbers(--num2) : "+(y-predecrement));

System.out.println("The subtraction of numbers(num2--) : "+(y-postdecrement));


}}