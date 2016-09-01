import java.io.*;

class Trial7 implements Serializable
{
	static int u = 9;
	int y = 23;

	public static void main(String[] args) 
	{
		Trial7 x = new Trial7();
		x.u = 22;
		x.y = 33;
		System.out.println("Value of u: "+x.u+" and Value of y: "+x.y);

		File f = new File("abc.txt");

		try{
			f.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(x);

			os.close();			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
