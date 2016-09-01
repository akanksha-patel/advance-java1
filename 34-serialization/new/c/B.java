import java.io.*;

class B{
	public static void main(String[] args){
		File file = new File("mno.txt");
		
		Student student = null;

		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			student = (Student)ois.readObject();

			ois.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(student.addr.city);
		System.out.println(student.addr.pin);
		System.out.println(student.addr.contact);
	}
}