import java.util.Scanner;

public class arraydemo8 {
    public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    int arr[][]=new int [2][2];
    for (int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.println("enter ele");
            arr[i][j] = sc.nextInt();
        }
    } 
    for(int ar[]:arr)
    {
        for(int a:ar){
                System.out.print(" "+a);
        }
        System.out.println(" ");
    }

}
}

