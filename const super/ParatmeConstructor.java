class Person1{
	int id;
	String name;
	Person1(){
		System.out.println("Default");
	}
	Person1(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
		
	}
}
public class ParatmeConstructor {

	public static void main(String[] args) {
		Person1 p= new Person1();
		
		Person1 p1= new Person1(10234,"SKR");
		p1.display();

	}

}
