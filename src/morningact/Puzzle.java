package morningact;

/*
	class Puzzle
	{
	public static boolean isOdd(int i)
	{
	return i%2==1;
	}
	public static void main(String arg[])
	{
	boolean b;
	b=isOdd(7); //11,-11,0,
	System.out.println(b);
	}
	}*/
	

	class Puzzle
	{
	public static boolean isOdd(int i)
	{
	return i%2!=0;
	}
	public static void main(String arg[])
	{
	boolean b;
	b=isOdd(7); //11,-11,0,
	System.out.println(b);
	}
	}