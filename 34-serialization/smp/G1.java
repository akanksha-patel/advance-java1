import java.io.*;

class Animal{
	int y;
}

class Dog extends Animal implements Serializable{
	int z;
}


class G1 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.y = 90;
		d.z = 20;

		System.out.println("Before - Value of y: "+d.y+" & value of z: "+d.z);
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

			System.out.println("After - Value of y: "+dg.y+" & value of z: "+dg.z);
			oi.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("Hello World!");
	}
}
