public class array2d2demo {
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={4,5,6};
        int c[]={7,8,9};
        int arr[][]=new int[3][];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        for (int ar[]:arr)//for each
        {
            for (int e:ar)
            {
                System.out.print(" "+e);

            }
            System.out.println("");
        }
    }
    
}

