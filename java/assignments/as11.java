package assignments;
import java.util.Scanner;
public class as11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter y");
        int y=sc.nextInt();
        System.out.println("value before swap x="+x+"y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("value after swap x="+x+"y="+y);


    }

}
