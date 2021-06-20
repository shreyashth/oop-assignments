package assignments;

public class as3 {
    public static void main(String args [] ) {
       int x=1,y=2,z=3;
        y= x^2+3*x-7;
       System.out.println("y="+y);
       y=x++ + ++x;
       System.out.println("x and y"+x+"and"+y);
       z=x++ - --y - --x +x++;
       System.out.println("x="+x+"y="+y+"z="+z); 

       
       boolean x=true,y=false,z=true;
       z=x&&y||!(x||y);//&& 
       System.out.println("x="+x+"y="+y+"z="+z);
       
       }
       
    
        }
    
    

