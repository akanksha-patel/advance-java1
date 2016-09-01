import java.io.*;

//The class is not serializable -----------------
class Student
{
	String name;
	int age;
}

class  A
{
	public static void main(String[] args) 
	{
		Student st = new Student();

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
