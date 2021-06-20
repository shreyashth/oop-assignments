package assignments;
import java.util.Scanner;
/* write a program to find simple interest .Take principle amount ,
rate of interest and time from user using Scanner.class    */

public class as8 {
    public static void main(String args[]){
        int SI=0;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter p");
        int P=sc.nextInt();
        System.out.println("enter r");
        int R=sc.nextInt();
        System.out.println("enter t");
        int T=sc.nextInt();
        SI = (P*R*T)/100;
        System.out.println("SI="+SI);

    }
    
}
