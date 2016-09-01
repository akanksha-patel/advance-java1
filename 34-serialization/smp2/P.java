import java.io.*;

class Y{
	int y = 4;
}
class X extends Y{
	int x = 3;
}
class P extends X implements Serializable{
	int p = 7;

	public static void main(String[] args) 
	{
		P w = new P();
		w.y = 10;
		w.x = 20;
		w.p = 30;
		
		File f = new File("xyz.txt");

		try{			
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fo);

			oos.writeObject(w);

			oos.flush();
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}


		try{
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			P m = (P)oi.readObject();
			
			System.out.println("y: "+m.y+" - x: "+m.x+" - p: "+m.p);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		
	}
}
