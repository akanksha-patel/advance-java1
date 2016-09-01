import java.io.*;

class O 
{
	public static void main(String[] args) 
	{
		try{
			FileInputStream fi = new FileInputStream("stt.txt");		
			ObjectInputStream oi = new ObjectInputStream(fi);
			N r = (N)oi.readObject();

			
			System.out.println(r.y);
			System.out.println(r.z);
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
