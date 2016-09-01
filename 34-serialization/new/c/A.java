import java.io.*;

class A{
	public static void main(String[] args){
		SubAddress ad = new SubAddress();
		ad.city = "Jbp";
		ad.pin = "482001";
		ad.contact = "9854784512";		
		
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
	SubAddress addr;
}

class Address{
	//Case 1:
	//String city;
	//String pin;

	//Case 2:
	String city = "bhopal";
	String pin = "453412";
}

class SubAddress extends Address implements Serializable
{
	String contact;
}