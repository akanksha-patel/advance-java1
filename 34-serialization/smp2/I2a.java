import java.io.*;


class I2a 
{
	public static void main(String[] args) 
	{	
		
		try{
			FileInputStream fo = new FileInputStream("dog.txt");
			ObjectInputStream oo = new ObjectInputStream(fo);
			Dog d = (Dog)oo.readObject();

			System.out.println(d.clr.collarSize);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

