class Test{
	int a = 10;
	static int b = 20;
    
	void tess()
    {
		//int a=50;//initi
		System.out.println(a);
		System.out.println(this.a);
        this.a = 100; //re inti
        System.out.println(this.a);
        
        this.b = 2000;
        System.out.println(b);
        
        System.out.println(a);
    }
}



    
public class SupperThis {
public static void main(String[] args) {
		new Test().tess();
		//new childTest().sup();
	}

}
