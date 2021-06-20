public class CheckedExp3{
public static void main(String[]args)
{
try{ 
m1();
}
catch(IOException e){
	System.out.println("exception handled");
}
{
System.out.println("remaining prog");
}
static void m1() throws IOException{
m2();
}
static void m2() throws IOException{
throw new IOException();
 }
 }
}

