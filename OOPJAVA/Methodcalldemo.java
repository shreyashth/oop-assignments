package OOPJAVA;
class Foo11{
    static void m1(){
                System.out.println("m1");
    }
    void m2(){
                System.out.println("m2");
    }
}

public class Methodcalldemo {
                public static void main(String args[]){
                    Foo11.m1();
                    new Foo11().m2();
                }
    
}
