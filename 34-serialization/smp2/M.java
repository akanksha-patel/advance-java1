import java.io.*;

class N implements Serializable
{
	int y;
	static int z = 89;
}

class M 
{
	public static void main(String[] args) 
	{
		N u = new N();
		u.y = 23;
		N.z = 34;

		try{
			FileOutputStream fo = new FileOutputStream("stt.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(u);

			oo.flush();
			oo.close();
		}catch(IOException	e){
			e.printStackTrace();
		}
	}
}
