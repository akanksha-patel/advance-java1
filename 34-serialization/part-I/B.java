import java.io.*;

class B 
{
	public static void main(String[] args) 
	{
		File f1 = new File("abc.txt");

		try{			

			FileInputStream fi = new FileInputStream(f1);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Shape x = (Shape)oi.readObject();

			System.out.println(x.l+" - "+x.w+" - "+x.h);
			
			
			oi.close();

		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		System.out.println("Hello World!");
	}
}

class Shape implements Serializable
{
	int l,w,h;
}