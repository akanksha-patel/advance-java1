import java.io.*;

public class SerializeDog {
  public static void main(String[] args) {
    //ABC c = new ABC(3);
	Collar c = new Collar(3);
    Dog d = new Dog(c, 5);
    System.out.println("before: collar size is "
    + d.getCollar().getCollarSize());
	System.out.println("& the dog size is: "+d.getDogSize());

    try {
      FileOutputStream fs = new FileOutputStream("text.txt");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(d);
      os.close();
    } catch (Exception e) { e.printStackTrace(); }
    
	try {
      FileInputStream fis = new FileInputStream("text.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      d = (Dog) ois.readObject();
      ois.close();
    } catch (Exception e) { e.printStackTrace(); }
    //System.out.println("after: collar size is "+  
    //d.getCollar().getCollarSize());

	System.out.println("The dog size is: "+d.getDogSize());
  }
}

class Dog implements Serializable {
  
  privateCollar theCollar;
  private int dogSize;

  public Dog(Collar collar, int size) {
    theCollar = collar;
    dogSize = size;
  }
  
  public Collar getCollar() { return theCollar; }
  public int getDogSize() { return dogSize; }
}

class Collar {
  int collarSize;
  
  public Collar(int size) { collarSize = size; }
  
  public int getCollarSize() { return collarSize; }
}

/*
class ABC extends Collar implements Serializable
{
	public ABC(int size){
		super(size);
	}
}*/