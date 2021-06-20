import java.util.Scanner;
public class arraydemo10 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter cols for"+i);
            int cols=sc.nextInt();
            arr[i]=new int[cols];
        
            for(int j=0;j<arr[i].length;j++){//{}written like this and shit boom j doesnt read
                    System.out.println("enter ele");
                    arr [i][j]=sc.nextInt();
        }
        }//proper place corrected afterwards ;)

    for(int ar[]:arr){
            for(int a:ar){
                System.out.print("  "+a);


            }
            System.out.println("");
    }

    
}
}