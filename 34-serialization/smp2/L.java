import java.io.*;

class L 
{
	public static void main(String[] args) 
	{
		SportsPerson p = new SportsPerson();
		System.out.println(p.height+" $");
		System.out.println(p.weight+" $");	
		
		p.height = 5;
		p.weight = 70;
		System.out.println(p.height+" -");
		System.out.println(p.weight+" -");	


		try{
			new ObjectOutputStream(new FileOutputStream("spr.txt")).writeObject(p);		
		}catch(FileNotFoundException w){
			w.printStackTrace();
		}catch(IOException w){
			w.printStackTrace();
		}
		
		try{
			FileInputStream fi = new FileInputStream("spr.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			SportsPerson r = (SportsPerson)oi.readObject();
				
			oi.close();

			System.out.println(r.height);
			System.out.println(r.weight);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

class SportsPerson implements Serializable
{
	transient float height = 6;
	float weight = 80;
}