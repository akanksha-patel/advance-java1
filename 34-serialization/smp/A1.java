import java.io.*;


class Student implements Serializable
{
	private String name;
	private int age;

	Student(String name, int age){
		this.name= name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}

class  A1
{
	public static void main(String[] args) 
	{
		Student st = new Student("Vinod", 22);

		File f = new File("obj.txt");

		try{
			f.createNewFile();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(st);
		
			o.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
