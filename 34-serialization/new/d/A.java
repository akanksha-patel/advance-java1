import java.io.*;

class A{
	public static void main(String[] args){
		Address ad = new Address();
		ad.city = "Jbp";
		ad.pin = "482001";
		
		Student st = new Student();
		st.name = "mohan";
		st.age = 12;
		st.addr = ad;
		
		File file = new File("mno.txt");

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
	transient Address addr = new Address("Bhopal", "485001");
}

//Address.class
final class Address{
	String city;
	String pin;

	Address(String city,String pin){
		this.city = city;
		this.pin = pin;
	}

	Address(){}

	public String toString(){
		return city+" - "+pin;
	}
}

/*
class NewAddress extends Address implements Serializable 
{
}*/