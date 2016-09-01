import java.io.*;

class  A2
{
	public static void main(String[] args) 
	{
		try{			
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream i = new ObjectInputStream(fi);
			Student st = (Student)i.readObject();

			System.out.println(st.getName()+" ---- "+st.getAge());
		
			i.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
