import java.io.*;

class A{
	public static void main(String[] args){
		Shape shape = new Shape();
		shape.l = 12;
		shape.h = 10;
		shape.w = 4;
		
		File file = new File("abc.txt");

		try{
			//file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(shape);

			oos.flush();
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

class Shape implements Serializable{
	int l;
	int w;
	int h;
}