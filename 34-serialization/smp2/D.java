import java.io.*;

class D 
{
	public static void main(String[] args) 
	{
		try{
			File f = new File("svstd.txt");

			FileInputStream  fi = new FileInputStream(f);

			ObjectInputStream oi = new ObjectInputStream(fi);

			Student st = (Student)oi.readObject();

			System.out.println(st);
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(ClassNotFoundException ie){
			ie.printStackTrace();
		}
	}
}
