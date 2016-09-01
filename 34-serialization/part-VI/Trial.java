import java.io.*;

class Student  implements Serializable
{
	String name;
	transient Address adrr;
	Student(String name,Address adrr){
		this.name = name;
		this.adrr = adrr;
	}

	private void writeObject(ObjectOutputStream os){
		try
		{
			os.defaultWriteObject();
			os.writeObject(adrr.city);
			os.writeInt(adrr.pinCode);	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	private void readObject(ObjectInputStream oi){
		try
		{
			oi.defaultReadObject();
			adrr = new Address((String)oi.readObject(),oi.readInt());
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}


class Address
{
	String city;
	int pinCode;
	Address(String city,int pinCode){
		this.city = city;
		this.pinCode = pinCode;
	}
}

class Trial
{
	public static void main(String[] args){
		Address a = new Address("jbp",482002);
		Student std = new Student("mohan",a);
		
		File f1 = new File("file1.txt");
		try
		{			
			f1.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f1);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(std);	
		}catch (IOException e)
		{
			e.printStackTrace();
		}

		try
		{
			FileInputStream fi = new FileInputStream(f1);
			ObjectInputStream is = new ObjectInputStream(fi);
			std = (Student)is.readObject();	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(std.adrr.city);

	}
}