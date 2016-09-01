import java.io.*;
class Student implements Serializable
{
	transient Address adr;
	String name;
	int age;

	private void writeObject(ObjectOutputStream os){
		try{
			os.defaultWriteObject();
			os.writeObject(adr.ct.ctNm);
			os.writeBoolean(adr.flag);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi){
		try{
			oi.defaultReadObject();			
			
			adr = new Address();
			adr.ct = new City();
			adr.ct.ctNm =  (String)oi.readObject();
			adr.flag = oi.readBoolean();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException ioe){
			ioe.printStackTrace();
		}

	}
}

class Address
{
	City ct;
	boolean flag = true;
}

class City
{
	String ctNm;
}


class Trial 
{
	public static void main(String[] args) 
	{
		City c = new City();
		c.ctNm = "Jabalpur";

		Address a = new Address();
		a.ct = c;
		
		Student st = new Student();
		st.adr = a;
		st.name = "Mohan";
		st.age = 12;
		
		System.out.println("Before: "+st.adr.ct.ctNm+" age: "+st.age+" name: "+st.name+" adrBool: "+st.adr.flag);


		File f = new File("abc.txt");

		try{
			f.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(st);

			os.close();

			//---------------------------------------------------

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student st2 = (Student)oi.readObject();
			System.out.println("After: "+st2.adr.ct.ctNm+" age: "+st2.age+" name: "+st2.name+" adrBool: "+st2.adr.flag);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException ioe){
			ioe.printStackTrace();
		}
	}
}
