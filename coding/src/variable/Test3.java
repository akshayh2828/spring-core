package variable;

public class Test3 
{
	int a;
	static int b=500;
    private void m5() {
		int c=a+15;
		System.out.println(c);
		a=60;
		
	}
    public void m7()
    {
    	
    }
	
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.m5();
		t.a=500;
		System.out.println(t.a+b);
		Test3 t2=new Test3();
		System.out.println(t.a+b);
		System.out.println(t.a);
		Test3 t1=new Test3();
		t1.m5();
		Test3 t3=new Test3();
		System.out.println(t3.a);

	}

	

}
