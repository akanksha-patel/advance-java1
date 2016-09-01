import java.io.*;

class J
{
	public static void main(String[] args){
		File f = new File("dog.txt");

		try{
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Dog r = (Dog)oi.readObject();
				
			oi.close();

			System.out.println(r.clr.collarSize);
			System.out.println(r.dogSize);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
}