import java.io.*;

class B
{

	public static void main(String[] args){
		File f = new File("save.txt");

		
		try{
			FileInputStream fi = new FileInputStream(f);

			ObjectInputStream oi = new ObjectInputStream(fi);

			Shape sh = (Shape)oi.readObject();

			System.out.println("L: "+sh.l);
			System.out.println("W: "+sh.w);
			System.out.println("H: "+sh.h);
			
		}catch(FileNotFoundException ie){
			ie.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}

	}

}