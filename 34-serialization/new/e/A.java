import java.io.*;

class A{
	public static void main(String[] args){
		Student st = new Student();
		st.name = "mohan";
		st.age = 12;		

		Address ad = new Address();		
		ad.phone = "894989034";
		ad.city = "Bhopal";
		ad.pin = 567823;

		st.addr = ad;
		
		File file = new File("kkr.txt");

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
	Address addr;
}

class Address extends Location  implements Serializable{	
	String phone;
}

class Location {
	String city = "Gwalior";
	int pin = 888888;
}