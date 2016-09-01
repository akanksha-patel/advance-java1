import java.io.*;

class E
{
	int y;

	E(int y){
		this.y = y;
	}
}

class D implements Serializable
{
	transient E e = new E(12);

	private void writeObject(ObjectOutputStream o){
		try{		
			o.defaultWriteObject();
			o.writeInt(e.y);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream i){
		try{
			i.defaultReadObject();
			e = new E(i.readInt());
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) 
	{
		D x = new D();
		
		try{
			System.out.println(x.e.y);
			File f = new File("abc.txt");
			f.createNewFile();
					
			FileOutputStream fx = new FileOutputStream(f);
			ObjectOutputStream ox = new ObjectOutputStream(fx);
			ox.writeObject(x);

			ox.close();

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			D u = (D)oi.readObject();

			oi.close();				
			System.out.println(x.e.y);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
