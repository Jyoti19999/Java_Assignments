import java.util.*;
class Circle

{ public static void main(String args[])

{   
 Scanner sc= new Scanner(System.in); 
 System.out.println("Enter the radius of circle");

 int radius=sc.nextInt();
 
 double Area=(3.14*radius*radius);
double Circumference=(2*3.14*radius);
System.out.println("The area of circle is "+Area);
System.out.println("The Circumference of circle is "+Circumference);
   

}


}