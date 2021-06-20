
class Students{
	int id;
	String name;
}



public class ObjectInsRefrence {
	
	public static void main(String[] args) {
		Students s = new Students();
			s.id=202013;
			s.name="Sarang";
			System.out.println(s.id);
			System.out.println(s.name);
			
			Students s1 = new Students();
			s1.id=203;
			s1.name="Sara";
			System.out.println(s1.id);
			System.out.println(s1.name);
		}

	}
