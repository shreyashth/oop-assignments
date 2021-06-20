package assignments;
import java.util.Scanner;
/*in a company an employee is paid as under if his basic salary is less than Rs.10000
then HRA=10% of basic salary and Da=90% of basic salary.
if his salary is either equal to or above Rs.10000 then HRA=rs.2000 and DA=98% of basic salary.
if the employee's salary is input by the user write a program to find his gross salary
[formula:GS=Basic+DA+HRA] */
public class as12 {
    public static void main(String args [] ){
               Scanner sc=new Scanner(System.in);
               System.out.println("enter sal");
               int sal=sc.nextInt();
               int DA;
               int HRA;
               
               if(sal<10000)
               {
                   HRA=10%sal;
                    DA=90%sal;
                    int GS=sal+DA+HRA;
                   System.out.println("gs="+GS);
               }
               else
                {
                    HRA=2000;
                 DA=98%sal;
                  int GS=sal+DA+HRA;
                 System.out.println("gs="+GS);
               
    }
}
    
}
