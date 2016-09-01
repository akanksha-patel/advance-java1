import java.io.*;

class Dog implements Serializable
{
	private transient Collar clr;
	private int dogSize;

	Dog(Collar clr,int dogSize){
		this.clr = clr;
		this.dogSize = dogSize;
	}

	public Collar getCollar(){
		return clr;
	}	

	private void writeObject(ObjectOutputStream oo){
		System.out.println("-------");
		try{
			oo.defaultWriteObject();
			oo.writeInt(clr.getCollarSize());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void readObject(ObjectInputStream oi){
		System.out.println("++++++");
		try{
			oi.defaultReadObject();
			clr = new Collar(oi.readInt());
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}

class Collar 
{
	private int collarSize;

	Collar(int collarSize){
		this.collarSize = collarSize;
	}

	public int getCollarSize(){
		return collarSize;
	}
}

class F {
	public static void main(String[] args) 
	{
		Collar c = new Collar(2);
		Dog d = new Dog(c,12);

		System.out.println(d.getCollar().getCollarSize());

		try{
			FileOutputStream fo = new FileOutputStream("obj.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(d);

			oo.close();
		}catch(Exception e){
			e.printStackTrace();
		} 


		try{
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Dog dg = (Dog)oi.readObject();

			System.out.println(dg.getCollar().getCollarSize());
			oi.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
