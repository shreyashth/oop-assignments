

package OOPJAVA;
class Foo3 {
        static void m1(){
                System.out.println("foo m1");
        }
    }
        class Bar3 extends Foo3{
      static  void m1(int i){
                System.out.println("bar m1");
             }
        }
public class Methodhidingdemo {
    public static void main(String args[]){
                Foo3 f = new Bar3();
                f.m1();
                Bar3 f1=new Bar3();//method call is decided (-not)on the basis (-of object) reference type
                f1.m1();//static method can be called without using object
                            //dont create code using object calling
                            //only static method is hidden in subclass
    }
        }

