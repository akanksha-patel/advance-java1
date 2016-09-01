import java.io.*;


class I2 
{
	public static void main(String[] args) 
	{
		Collar x = new Collar();
		x.collarSize = 11;

		Dog d = new Dog();
		d.dogSize = 20;
		d.clr = x;

		//File f = new File("dog.txt");
		
		try{
			FileOutputStream fo = new FileOutputStream("dog.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(d);

			oo.flush();
			oo.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

class Dog implements Serializable
{
	transient Collar clr;
	int dogSize;

	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();

			oos.writeInt(clr.collarSize);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	private void readObject(ObjectInputStream ois){

		try{
			ois.defaultReadObject();

			Collar e = new Collar();
			e.collarSize =	 ois.readInt();
			clr = e;
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		
	}

}

class Collar
{
	int collarSize;
}
