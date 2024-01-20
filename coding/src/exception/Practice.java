package exception;

public class Practice 
{
	public static void main(String[] args) {
		try {
			System.out.println("hii");
			System.out.println("hello");
			System.out.println(10/0);
			System.out.println("akshay");
			System.out.println("hambarde");
			
		} catch (Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("akshay");
			System.out.println("hambarde");
			
		}
	}

}
