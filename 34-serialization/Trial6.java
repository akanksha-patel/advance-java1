import java.io.*;

class X1
{
	//Case 1:
	//String a = "abc";
	//int z = 345;

	//Case 2:
	String a;
	int z;
}

class X2 extends X1 implements Serializable
{
	String x = "pqr";
	int y = 889;
}

class Trial6 
{
	public static void main(String[] args) 
	{
		
		X2 t = new X2();
		t.a = "www";
		t.z = 1;
		t.x = "yyy";
		t.y = 2;

		System.out.println("Before: "+t.a+" - "+t.z+" - "+t.x+" - "+t.y);
		File f = new File("abc.txt");

		try{
			f.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(t);

			os.close();

			//---------------------------------------------------

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			X2 u = (X2)oi.readObject();
			System.out.println("After: "+u.a+" - "+u.z+" - "+u.x+" - "+u.y);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException ioe){
			ioe.printStackTrace();
		}
	}
}
