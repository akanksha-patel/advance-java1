import java.io.*;

class A{
	public static void main(String[] args){
		City city = new City();
		city.cityName = "jbp";
		
		Address ad = new Address();
		ad.city = city;
		ad.pin = "482001";
		
		Student st = new Student();
		st.name = "mohan";
		st.age = 12;
		st.addr = ad;
		
		File file = new File("xyz.txt");

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

class Address  implements Serializable{
	City city;
	String pin;
}

class City implements Serializable{
	String cityName;
}
