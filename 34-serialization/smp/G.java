import java.io.*;

class Animal{
	int y = 9;
}

class Dog extends Animal implements Serializable{
	int z = 2;
}


class G 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		System.out.println(d.y+" -- "+d.z);
		System.out.println("---------------");
		d.y = 90;
		d.z = 20;
		System.out.println(d.y+" -- "+d.z);

		System.out.println("---------------");

		//System.out.println("Before - Value of y: "+d.y+" & value of z: "+d.z);
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
			
			System.out.println(dg.y+" -- "+dg.z);
			//System.out.println("After - Value of y: "+dg.y+" & value of z: "+dg.z);
			oi.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("Hello World!");
	}
}
