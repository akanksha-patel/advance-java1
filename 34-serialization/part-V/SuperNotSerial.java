import java.io.*;

class SuperNotSerial {
	public static void main(String [] args) {
		Dog d = new Dog(35, "Fido",12.9f);
		d.u = 6;
		System.out.println("before: " + d.name + " "+ d.weight+ " "+ d.f+ " "+ d.u);
		try {
			FileOutputStream fs = new FileOutputStream("test.txt");
			 ObjectOutputStream os = new 	ObjectOutputStream(fs);
			 os.writeObject(d);
			 os.close();
		 } catch (Exception e) { e.printStackTrace(); }

		try {
			FileInputStream fis = new FileInputStream("test.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.println("after: " + d.name + " "+ d.weight+ " "+ d.f+ " "+ d.u);
	}
}

class Dog extends Animal implements Serializable {
     String name;
	 transient float f = 7;
	 static int u = 56;
     Dog(int w, String n,float f) {
		weight = w; // inherited
		name = n; // not inherited
		this.f = f;
     }
}
class Animal { // not serializable !
	int weight = 42; 
}