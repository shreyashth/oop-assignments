package assignments;
import java.util.Scanner;
/*program to check entered year is a leap year or not */
public class as14 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
          System.out.println("enter year");
          int year=sc.nextInt();
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))//&&=and ||=or
     {
        System.out.println("leap year");
     }
            else{
        System.out.println("not a leap year");
     }
}

}
