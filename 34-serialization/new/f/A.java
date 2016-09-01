import java.io.*;

class A{
	public static void main(String[] args){	

		Address ad = new Address();		
		ad.phone = "7777777777";
		ad.pin = 111111;
		
		Student st = new Student();
		st.name = "mohan";
		st.age = 12;	
		st.addr = ad;
		
		File file = new File("pqr.txt");

		try{
			file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(st);

			oos.flush();
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

class Student implements Serializable{
	String name;
	int age;
	transient Address addr;

	private void writeObject(ObjectOutputStream os){
		try{
			System.out.println("---------");
			os.defaultWriteObject();
			os.writeObject(this.addr.phone);
			os.writeInt(this.addr.pin);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi){
		try{
			System.out.println("~~~~~~~~");
			oi.defaultReadObject();

			Address adr = new Address();
			adr.phone = (String)oi.readObject();
			adr.pin = oi.readInt();
			
			this.addr = adr;
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

//.java --x  //.class ---v
final class Address{	
	String phone;
	int pin;
}