import java.io.*;
class Student implements Serializable
{
	transient Address adr = new Address();
	transient String name = "Ganesh";
	transient int age = 23; 	
}

class Address implements Serializable
{
	String ctNm = "Bhopal";
}


class Trial5 
{
	public static void main(String[] args) 
	{	
		Student st = new Student();
		
		System.out.println("Before: "+st.adr.ctNm+" age: "+st.age+" name: "+st.name);


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
			System.out.println("After: "+st2.adr+" age: "+st2.age+" name: "+st2.name);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException ioe){
			ioe.printStackTrace();
		}
	}
}
