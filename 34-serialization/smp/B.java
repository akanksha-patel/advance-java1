import java.io.*;

class Student implements Serializable
{
	Address adr;
/*
	public String toString(){
		return adr.city.ctNm;
	}*/
}

class Address implements Serializable
{
	City city;
}


class City implements Serializable
{
	String ctNm;
}

class B 
{
	public static void main(String[] args) 
	{
		City ct = new City();
		ct.ctNm = "Jabalpur";
		
		Address adr = new Address();
		adr.city = ct;

		Student st = new Student();
		st.adr = adr;

		try{
			FileOutputStream fo = new FileOutputStream("obj.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(st);
			oo.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		

		try{
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student st2 = (Student)oi.readObject();
			System.out.println(st2.adr.city.ctNm+" ---");	

			oi.close();	
		}catch(Exception e){
			e.printStackTrace();
		}


		
	}
}
