import java.io.*;

class C
{
	public static void main(String[] args){
		Student s = new Student("Raghav",12);
		
		File f = new File("svstd.txt");

		try{
			f.createNewFile();

			FileOutputStream fo = new FileOutputStream(f);

			ObjectOutputStream oo = new ObjectOutputStream(fo);

			oo.writeObject(s);

			oo.flush();
			oo.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}


class Student implements Serializable
{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" - "+age;
	}
}