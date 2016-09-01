import java.io.*;


class I 
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
	Collar clr;
	int dogSize;
}

class Collar implements Serializable
{
	int collarSize;
}
