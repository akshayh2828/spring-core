package thread;

public class Test {
	public static void main(String[] args) {
		Tread1 t1=new Tread1();
		Thread t=new Thread(t1);
		t.run();
	}

}
