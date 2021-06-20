package assignments;
import java.util.Scanner;
/*write a program to convert temprature from Fahrenheit to Celsius 
take Fahrenheit as input using Scanner.class (formula C=5*(f-32)/9)*/
public class as10 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  
    double C=0;
    System.out.println("enter temp in F");
    double F=sc.nextDouble();
    C=5*(F-32)/9 ;
    System.out.println("C="+C);


}
}