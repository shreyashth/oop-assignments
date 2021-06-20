package assignments;
/*write program to read the days(E.g 670 days)
as integer values using scanner.class now convert the entered days into complete 
years,months,days and print them  */
import java.util.Scanner;
public class as9 {
    public static void main(String args[]){
      
    
               int m, year, week, day;
               Scanner sc = new Scanner(System.in);
               System.out.print("Enter the number of days:");
               m = sc.nextInt();
               year = m / 365;
               m = m % 365;
               System.out.println("No. of years:"+year);
               week = m / 7;
               m = m % 7;
               System.out.println("No. of weeks:"+week);
               day = m;
               System.out.println("No. of days:"+day);
       }
       }

    
    

