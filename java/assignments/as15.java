
import java.util.Scanner;
/**Accept person's gender(Character m for male and f for female),
 age(integer)as input and then check whether person is eligible
 for marrige or not
 */
public class as15 {
    

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter gender");
    char Gender = sc.next().charAt(0); 
    System.out.println("enter age");
    int age=sc.nextInt();
      if(Gender=='m')
    {
      if(age>=21)
         System.out.println("You can marry!");
      else
         System.out.println("You can not marry!");
    }
    else if(Gender=='f')
    {
      if(age>=18)
         System.out.println("You can marry!");
      else
         System.out.println("You can not marry!");
    }
    else
         System.out.println("Invalid input Gender");
   }
}
