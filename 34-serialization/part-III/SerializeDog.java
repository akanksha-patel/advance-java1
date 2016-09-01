import java.io.*;

public class SerializeDog {
  public static void main(String[] args) {
    Collar c = new Collar(3);
    Dog d = new Dog(c, 5);
    System.out.println("before: collar size is "
    + d.getCollar().getCollarSize());
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
	System.out.println("See the collar is not recreated : "+d.getCollar());
    //System.out.println("after: collar size is "+d.getCollar().getCollarSize());
  }
}

class Dog implements Serializable {
  private transient Collar theCollar;
  private int dogSize;
  public Dog(Collar collar, int size) {
    theCollar = collar;
    dogSize = size;
  }
  public Collar getCollar() { return theCollar; }
}

final class Collar {
  private int collarSize;
  public Collar(int size) { collarSize = size; }
  public int getCollarSize() { return collarSize; }
}