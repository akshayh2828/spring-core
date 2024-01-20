package variable;

public class Example2
{
	public int a;
	public static int b=45;
	public static  void m1()
	{
		int d=5;
		int c=b+d;
		System.out.println(c);
	}
	public  void m2()
	{
		int d=5;
		int f=d+a;
		System.out.println(f);
	}
	public void m3()
	{
		int j = 5;
		int h = a+j;
		System.out.println(h);
	}
	public static void m4()
	{
		System.out.println(b);
	}
	public void m6()
	{
		System.out.println(a);
		a=45;
	}
	private void m9()
	{
		a=99;
	}
	
}
