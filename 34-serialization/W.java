import java.io.*;
class W implements Serializable
{
	transient int a = 23;
	transient boolean s = true;
	transient float w = 34.6f;
	transient char q = '$';
	transient String str = "haji";

	public static void main(String[] args) 
	{
		W a1 = new W();

		System.out.println("Before: "+a1.a+" "+a1.s+" "+a1.w+" "+a1.q+" "+a1.str);
		try{
			FileOutputStream fl = new FileOutputStream("test_.txt");
			ObjectOutputStream os = new ObjectOutputStream(fl);
			os.writeObject(a1);
			os.close();
		}catch(Exception e){	}
		
		W x = null;
		try{
			FileInputStream fi = new FileInputStream("test_.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			x = (W)oi.readObject();
		}catch(Exception e){}
		System.out.println("Before: "+x.a+" "+x.s+" "+x.w+" "+x.q+" "+x.str);

		System.out.println("Hello World!");
	}
}
