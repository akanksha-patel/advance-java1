import java.io.*;


class I1 
{
	public static void main(String[] args) 
	{
		Collar x = new Collar();
		x.collarSize = 7;

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
	
	//Special Callback Contract Method 
	private void writeObject(ObjectOutputStream o){
		try{
			o.defaultWriteObject();
			o.writeInt(clr.collarSize);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream i){
		try{
			i.defaultReadObject();
			Collar e = new Collar();
			e.collarSize = i.readInt();
			clr = e;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

class Collar
{
	int collarSize;
}
