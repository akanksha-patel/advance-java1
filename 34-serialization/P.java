import java.io.*;

class Q
{
	//Case 1:
	/*
	int a = 23;
	String str = "mohan";*/

	//Case 2:	
	transient int a = 23;
	transient String str = "mohan";
}

class P extends Q implements Serializable 
{
	transient Q t;

	public static void main(String[] args) 
	{
		P n = new P();
		n.a = 700;
		n.str = "dinesh";

		try{
			System.out.println(n.a+"=="+n.str);
			File f = new File("toSer.txt");
			f.createNewFile();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(n);
			
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			P x = (P)oi.readObject();
			System.out.println(x.a+"=="+x.str);
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
			


		
	}
}
