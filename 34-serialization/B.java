import java.io.*;

class C
{
	int y = 23;
}

class B extends C implements Serializable
{
	String g = "mohan";
	
	public static void main(String[] args){
		B b = new B();
		b.y = 67;
		b.g = "dinesh";

		try{
			File f = new File("abc.txt");
			f.createNewFile();
			
			System.out.println(b.y+" "+b.g);
			FileOutputStream fx = new FileOutputStream(f);
			ObjectOutputStream ox = new ObjectOutputStream(fx);
			ox.writeObject(b);

			ox.close();

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			B u = (B)oi.readObject();

			oi.close();		
			System.out.println(u.y+" "+u.g);
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}
}