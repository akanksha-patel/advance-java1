import java.io.*;

class Trial8 
{
	public static void main(String[] args) 
	{
		File f = new File("abc.txt");
		try{
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Trial7 e = (Trial7)oi.readObject();
			System.out.println("Value of u: "+e.u+" and Value of y: "+e.y);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException ioe){
			ioe.printStackTrace();
		}

		
	}
}
