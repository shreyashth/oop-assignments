import java.util.Scanner;

public class Arraydemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int i=0;i<ar.length;i++){
            System.out.println("enter ele");
            ar[i]=sc.nextInt();

        }
        //for(int i=0;i<ar.length;i++)
        for(int a:ar) //for traversing
        {//suppose u have to get all elements one by 1 then only 
            //if you have to store u cannot do it
            System.out.println(ar[i]);
        }
    }

}

