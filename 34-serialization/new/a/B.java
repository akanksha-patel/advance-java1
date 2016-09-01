import java.io.*;

class B{
	public static void main(String[] args){
		
		File file = new File("abc.txt");
		Shape shape = null;

		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			shape = (Shape)ois.readObject();

			ois.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		System.out.println(shape.l+" -- "+shape.h+" -- "+shape.w);
	}
}