package OOPJAVA;
class Employee{
    private int empId;
    private String empName;
    private static int total;
    void set(int id,String name,int t)
    {
        empId = id;
        empName=name;
        total=t;
    }
    void show(){
            System.out.println(empId+""+empName+""+total);
    }
}
public class employeedemo {
    public static void main(String args[]){
        Employee e=new Employee();
        e.set(101,"sh",1);
        e.show();
        Employee e1=new Employee();//where as instance variable gets their separate  
                                    //memmory allocation on heap
        e1.set(102,"th",2);
        e1.show();
        e.show();//static variable gets only single memmory allocation at only one place(employee stack)
                    // s0 op:2 which is replaced 1memmory is allocated shared by all the objects
    }
                
}
