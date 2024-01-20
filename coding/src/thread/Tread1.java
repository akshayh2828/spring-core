package thread;

public class Tread1 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
