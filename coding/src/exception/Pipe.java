package exception;

public class Pipe {
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
			String s=null;
			System.out.println(s.length());
			
		} catch (ArithmeticException  |  NullPointerException n) {
			System.out.println("akshay");
			
		}
		
	}

}
