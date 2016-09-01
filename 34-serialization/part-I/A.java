import java.io.*;

class A 
{
	public static void main(String[] args) 
	{
		File f1 = new File("abc.txt");

		try{
			f1.createNewFile();

			Shape sh = new Shape();
			sh.l = 20;
			sh.h = 40;
			sh.w = 25;

			FileOutputStream fo = new FileOutputStream(f1);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(sh);
			
			oo.flush();
			oo.close();

		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("Hello World!");
	}
}

class Shape implements Serializable
{
	int l,w,h;
}