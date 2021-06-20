package assignments;

/* write a program to calculate sum of 5 subjects marks & find percentage Take 
the obtained marks from user using Scanner class 
output should be in this format [percentage marks=99%] concat  */
public class as7 {
    public static void main(String args[]){
        double a,b,c,d,e=0;
       a=90;
       b=90;
       c=90;
       d=90;
       e=90;
       double sum=0;
       sum=a+b+c+d+e;
       double per=0;
       per=sum/500*100;
       System.out.println("sum="+sum);
       System.out.println("per"+per+"%");


    }
}
