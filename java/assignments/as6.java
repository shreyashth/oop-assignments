package assignments;
import java.util.Scanner;
/* write a program that takes radius of circle as input .
read the entered radious using Scanner.class
then calculate and prints the areas and circumference of the circle */
public class as6 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter radious");
      double r=sc.nextInt();
      double area=0;
      area= 3.14*r*r;
         System.out.println("area="+area);
     double circum=0;
     circum=2*3.14*r;
     System.out.println("circumfrence="+circum);
    }
    
}
