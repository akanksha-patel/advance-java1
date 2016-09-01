import java.io.*;

class Animal  implements Serializable
{
}

class Cow extends Animal
{

}

class Dog extends Animal
{
}

class Cat extends Animal
{
}

class C 
{
	public static void main(String[] args) 
	{
		Animal[] an = {new Cat(),new Dog(),new Cow()}; 

		try{
			FileOutputStream fo = new FileOutputStream("obj.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(an);
		
			oo.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		
		try{
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Animal[] x = (Animal[])oi.readObject();
			
			for(Animal e : x){
				System.out.println(e);
			}
			
			oi.close();
		}catch(Exception e){
			e.printStackTrace();		
		}	
		
	}
}
