import java.io.*;

class Cat implements Serializable { 	
	String name;
	int age;

	Cat(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "My cat's name is :"+name+" & age: "+age;
	}
} 

public class SerializeCat {
  public static void main(String[] args) {
    Cat c = new Cat("miki",3); 
    try {
      FileOutputStream fs = new FileOutputStream("xyz.txt");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(c); 
      os.close();
    } catch (Exception e) { e.printStackTrace(); }
    
    try {
      FileInputStream fis = new FileInputStream("xyz.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      c = (Cat) ois.readObject(); 
	  System.out.println(c);
      ois.close();
    } catch (Exception e) { e.printStackTrace(); }
  }
}
