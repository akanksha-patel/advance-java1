import java.io.*;

class G
{
	int y = 23;
}

class F extends G implements Serializable
{
	String g = "mohan";

	private void writeObject(ObjectOutputStream o){
		try{		
			o.defaultWriteObject();
			o.writeInt(y);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream i){
		try{
			i.defaultReadObject();
			y = i.readInt();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args){
		F b = new F();
		b.y = 67;
		b.g = "dinesh";

		try{
			File f = new File("abc.txt");
			f.createNewFile();
			
			System.out.println(b.y+" "+b.g);
			FileOutputStream fx = new FileOutputStream(f);
			ObjectOutputStream ox = new ObjectOutputStream(fx);
			ox.writeObject(b);

			ox.close();

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			F u = (F)oi.readObject();

			oi.close();		
			System.out.println(u.y+" "+u.g);
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}
}