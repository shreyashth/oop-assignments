package OOPJAVA.singleinheritance;
//single inheritance
class Employee{
        private int empId;
        private String empName;
        void set(int empId,String empName){
                this.empId=empId;
                this.empName=empName;
        }

void show(){//overriding
        System.out.println(empId+""+empName);
}
}
class Manager extends Employee{
        private int ta;
        private int da;
        void set(int empId,String empName,int ta,int da){
                set(empId,empName);
                this.ta=ta;
                this.da=da;
        }
        void show(){//method overriding
            super.show();
            System.out.println(ta+""+da);
        }
}
public class employeedemo1 {
        public static void main(String args[]){
            Manager m=new Manager();
            m.set(101,"ram",9000,600);
            m.show();
        }
}
