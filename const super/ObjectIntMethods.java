class Student1{
			int id ;
			String name;
			
			void insertRecord(int i,String n) {
				i=id;
				n=name;
				
			}
			void display() {
				System.out.println(id+" "+name);
			}
		}
public class ObjectIntMethods {

	public static void main(String[] args) {
				Student1 s1=new Student1();
				s1.insertRecord(40123,"Lalit");
				s1.display();
			}

		

	}


