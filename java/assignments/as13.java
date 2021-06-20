package assignments;
/* program to find greast in 3 numbers
[once using if else statement and then using ternary operator] */
public class as13 {
                 public static void main(String[] args){
                     int a,b,c;
                     a=21;
                     b=65;
                     c=22;
                     int z=0;
                   /*   if(a>b||a>c)
                     {
                            System.out.println("A is largest");
                     }
                     else if(b>c)
                    {
                        System.out.println("b is largest");
                    }
                    else{
                        System.out.println("c is largest");
                    }
                 }*/

  z= a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
  System.out.println("biggest="+z);

}
}
