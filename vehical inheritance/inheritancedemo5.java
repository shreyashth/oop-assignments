    package corejava;

import java.util.Scanner;


class vehicle
{
Scanner sc=new Scanner(System.in);
int mileage;
int price;
public void getdata()
{
System.out.print("enter mileage");
mileage=sc.nextInt();
System.out.print("enter price of vehicles");
 price=sc.nextInt();
}
void display1()
{


	System.out.print("milege="+mileage);
}
}

class car extends  vehicle
{
	Scanner sc=new Scanner(System.in);
int ownership_cost, warranty,seating_capacity;
String fuel_type[];
public void getcar()
{
System.out.println("enter the ownership cost");
int ownership_cost= sc.nextInt();
System.out.println("enter the warranty by years\n");
int warranty=sc.nextInt();
System.out.println("enter the seating capacity\n");
int seating_capacity=sc.nextInt();
System.out.println("enter the fule type(diesel or petrol\n");
String fuel_type=sc.next();
}
void display2()
{
System.out.println("\nownershipcost:\t"+ownership_cost+"\n"+"\nwarranty:\t"+warranty);
System.out.println("\nseating capacity:\t"+seating_capacity+"\nfuletype:\t"+fuel_type);
}
};
class bike extends vehicle
{
	Scanner sc=new Scanner(System.in);
int no_of_cylinder,no_of_gears,fuel_tank_size;
String cooling_type,wheel_type;
public void getbike()
{
System.out.println("enter the no of cylinders\n");
int no_of_cylinder=sc.nextInt();
System.out.println("enter the no of gears\n");
int no_of_gears=sc.nextInt();
System.out.println("enter the fuel tank size(in inches)\n");
int fuel_tank_size=sc.nextInt();
System.out.println("enter the cooling type(air liquid or oil)\n");
String cooling_type=sc.next();
System.out.println("enter the wheel type(alloy or spokes)\n");
String wheel_type=sc.next();
}
void display2()
{
System.out.println("\n no of cylinders:"+no_of_cylinder +"\nno ofgears:\t" +no_of_gears);
System.out.println("fuel tank size:\t"+fuel_tank_size +"\ncoolingtype:\t"+cooling_type);
System.out.println("\nwheel type:\t"+wheel_type);
}
}
class audi extends  car
{
	Scanner sc=new Scanner(System.in);
String model_type;
public void get_model()
{
System.out.println("enter the the model type(A6,A8 L,Q8)\n");
String model_type=sc.next();;
}
void display3()
{
System.out.println("nmodel type:"+model_type);
}
void fun()
{
	audi a=new audi();
a.get_model();
a.getcar();
a.getdata();
a.display1();
a.display2();
a.display3();
}
}
class ford extends  car
{

String model_type;
public void get_model()
{
System.out.println("enter the the model type(endeavour,figo,aspire)");
String model_type=sc.next();
}
void display3()
{
System.out.println("\nmodel type:\t"+model_type);
}
void fun()
{
	ford c=new ford ();
c.get_model();
c.getcar();
c.getdata();
c.display1();
c.display2();
 c.display3();
}
};
class bajaj extends  bike
{
	Scanner sc=new Scanner(System.in);
String  make_type;
public void get_make()
{
System.out.println("enter the the make type(chetak,dominar,pulsar)\n");
String make_type=sc.next();
}
void display3()
{
System.out.println("\nmake type:\t"+make_type);
}
void fun()
{
	bajaj b= new bajaj();
b.get_make();
b.getbike();
b.getdata();
b.display1();
b.display2();
b.display3();
}
}
 class tvs extends  bike
{
	Scanner sc=new Scanner(System.in);
String make_type;
public void get_make()
{
System.out.println("enter the the make type(chetak,dominar,pulsar)\n");
String make_type=sc.next();
}
void display3()
{
System.out.println("\nmake type:\t"+make_type);
}
void fun()
{
	tvs t=new tvs();
t.get_make();
t.getbike();
t.getdata();
t.display1();
t.display2();
t.display3();
}
}
public class inheritancedemo5 {

public static void main(String args[]) {
	

{
	Scanner sc=new Scanner(System.in);
tvs t=new tvs();
bajaj b=new bajaj();
audi a=new audi();
ford f=new ford();
int c,d;
System.out.println("enter the choice\n1:car\n2:bike\n3:Exit(0)\n");
 c=sc.nextInt();
if(c==1)
{
System.out.println("enter the choice\n1:Audi\n2:Ford\n3:Exit(0)");
d=sc.nextInt();
}
else
{
System.out.println("enter the choice\n1:Bajaj\n2:Tvs\n3:Exit(0)");
d=sc.nextInt();
}
switch(c){
case 1:
{
switch(d)
{
case 1:
a.fun();
break;
case 2:
f.fun();
break;
case 3:

}
}
break;
case 2:
{
switch(d)
{
case 1:
b.fun();
break;
case 2:
t.fun();
break;
case 3:
break;
default:
	System.out.println("enter correct option");
}
}
case 3:
break;
default:
System.out.println("enter correct option");
}

}
}
}