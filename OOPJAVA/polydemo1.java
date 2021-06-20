
package OOPJAVA;
class Foo2 {
        void m1(){
                System.out.println("first m1");//early binding
        }
    }
        class Bar1 extends Foo2{
        void m1(int i){
                System.out.println("second m1");
             }
        }



public class polydemo1 {
    public static void main(String args[]){
        //Foo2 f=new Foo2();
       Foo2 f=new Bar1();
      // Bar1 f=new Bar1();
        f.m1(); //compiler will not take decision which method is called  
                //dynamic method dispatch -runtime polymorphisum 
       

    }
        }
