import java.io.*;

class A
{
	public static void main(String[] args){
		Shape s = new Shape();
		s.l = 7;
		s.w = 8;
		s.h = 9;

		File f = new File("save.txt");

		try{
			f.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f);

			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(s);


		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}


class Shape implements Serializable
{
	int l;
	int w;
	int h;
}