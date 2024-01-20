package contrictor;

public class Test{

	public static void main(String[] args) 
	{
		Human h0=new Human();
		System.out.println(h0);
		Human human=new Human("santosh", "sarvesh", "pawar", 10, 20, 30);
		System.out.println(human);
		Human h=new Human("nikhil", "sakharam", "bhide");
		System.out.println(h);
		Human h1=new Human(10, 15, 25);
		System.out.println(h1);
	}

}
