import java.io.*;

class Xyz implements Serializable
{
	transient boolean f = true;
	transient char ch = 'A';
	transient byte b = 127;
	transient short s = 255;
	transient int i = 45;
	transient long l = 96;
	transient float fd = 5f;
	transient double d = 8.2;

	transient String str = "mohan";
}

class E 
{
	public static void main(String[] args) 
	{		
		Xyz m = new Xyz();
		System.out.println(m.f);
		System.out.println(m.i);
		System.out.println(m.d);
		System.out.println(m.str);

		try{
			FileOutputStream fo = new FileOutputStream("obj.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(m);
		
			oo.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("\n===================\n");
		
		try{
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Xyz x = (Xyz)oi.readObject();
			
			System.out.println(x.f);
			System.out.println(x.i);
			System.out.println(x.d);
			System.out.println(x.str);
			
			oi.close();
		}catch(Exception e){
			e.printStackTrace();		
		}	
		
	}
}
