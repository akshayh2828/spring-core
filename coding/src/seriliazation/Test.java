package seriliazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Student student =new Student("akshay", "akshay@12", 27, "nanded");
		try {
			FileOutputStream fos=new FileOutputStream("ob.text");
			ObjectOutputStream Obs=new ObjectOutputStream(fos);
			
	         Obs.writeObject(student);
	         Obs.close();
			fos.close();
			System.out.println("hii aksahy");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
