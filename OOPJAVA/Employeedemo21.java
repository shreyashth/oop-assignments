package OOPJAVA;
class Foo{
    int i=100;
    void m1(){
            System.out.println("m1 foo");
    }
}
class Bar extends Foo{
    int i=200;
    void m1(){
        super.m1();//first use of super is used to overrideen menthod of super class in sub class
        System.out.println("m1 bar");
    }
    void show() {
            System.out.println(i+" "+i);//subclass variable hiding super class variable
           // System.out.println(i+" "+super.i);//to unhide
    }
}
public class Employeedemo21 {
            public static void main(String[] args){
                Bar b=new Bar();
                b.m1();
                b.show();
            }
    
}
