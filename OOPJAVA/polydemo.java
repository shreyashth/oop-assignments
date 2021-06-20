package OOPJAVA;
class Foo1 {
        void m1(){
                System.out.println("first m1");//early binding
        }
        void m1(int i){
                System.out.println("second m1");
        }
}
public class polydemo {
        public static void main(String args[]){
                Foo1 f=new Foo1();
                f.m1();     /*compile time polymorphism -methods are called at runtime 
                           but which methods are called this decision is taken at compile 
                            time this method is known as early binding (-static binding)
                            compile time polymorphism happen if you overlad a method */
                f.m1(123); //this decision is taken on basis of parameter and argument matching
        }
    
}
