package OOPJAVA;
class Person1 {
    void getDetail(){
                    System.out.println("person details");
    }
    void getJob(){
                    System.out.println("person job");
    }
}
class Employee2 extends Person1{
                void getJob(){
                        System.out.println("employee job");

                }
                void getDept(){
                        System.out.println("employee dept ");
                }
}
public class employeedemo16 {
                public static void main(String args[]){
                    Person1 p=new Person1 ();
                    p.getDetail();
                    p.getJob();
                  
                    Employee2 p1=new Employee2();
                    p1.getDetail();
                    p1.getJob();//u can never get overwritten method of superclass using sub class
                    p1.getDept();
                   //new program 
                    Person1 p3=new Employee2();//reference upcasting (sub to super)
                    p3.getDetail();
                    p3.getJob();
                    //p3.getDept();
                    Employee2 e=(Employee2)p;//down casting its explicit
                    e.getDetail();
                    e.getJob();
                    e.getDept();
                //new program
                    Person1 ar[]={new Employee2(),new Employee2()};
                for(Person1 a:ar){
                    a.getJob();//problem occurs if dept is called
                }
                for(Person1 a:ar){
                    
                    Employee2 e=(Employee2)a;// thats why we use this
                    e.getDept();
                }
                for(Person1 a:ar){
                    if(a instanceof Employee2){
                    Employee2 e=(Employee2)a;// to check is a relationship -u get false here
                    e.getDept();
                    }

    
}
