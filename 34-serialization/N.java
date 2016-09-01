import java.io.*;

class N implements Serializable 
{
	transient int a = 23;
	transient String str = "mohan";

	public static void main(String[] args) 
	{
		N n = new N();

		try{
			System.out.println(n.a+"=="+n.str);
			File f = new File("toSer.txt");
			f.createNewFile();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(n);
			
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			N x = (N)oi.readObject();
			System.out.println(x.a+"=="+x.str);
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
			


		
	}
}
