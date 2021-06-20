package OOPJAVA;
class Person{
    Person(){
            System.out.println("no arg person");//no arg constructor is inexplicitely called
    }
}
class Employe1 extends Person{
    Employe1(){
            System.out.println("no -arg Employee");
    }
    Employe1(int i){
        System.out.println("parameter Employee");
}
}

public class employeedemo11 {
        public static void main(String args[] ){
                Employe1 e=new Employe1(12);//here
                Employe1 e1=new Employe1();
        }
    
}
