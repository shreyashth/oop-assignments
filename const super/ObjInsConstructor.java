
class student{
	int id;
	String name;
	student(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("id and name are:"+id+ " "+name);
	}
	
}
public class ObjInsConstructor {

	public static void main(String[] args) {
		student s1= new student(102, "Rutuja");	
			s1.display();

		}

	}

