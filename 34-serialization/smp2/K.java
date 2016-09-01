import java.io.*;
import java.util.*;

class K 
{
	public static void main(String[] args) 
	{
		File f = new File("abc.txt");
		
		//Case 1:
		//int[] e = {45,78,65};
		
		
		//Case 2:
		/*
		Employee[] e = new Employee[2];
		e[0] = new Employee("amit", 40000);	
		e[1] = new Employee("rahul", 30000);	
		*/

		//Case 3:
		
		ArrayList e = new ArrayList();
		e.add(new Employee("namit", 30000));
		e.add(new Student("kartik", 12));
		e.add(45);

		//###############################Write
		try{			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);

			oos.flush();
			oos.close();
		}catch(FileNotFoundException w){
			w.printStackTrace();
		}catch(IOException w){
			w.printStackTrace();
		}
		

		//++++++++++++++++++++++++++++Read
		try{
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			//Case 1:
			/*		
			int[] x = (int[])ois.readObject();
			
			for(int tmp : x){
				System.out.println(tmp+" *****");
			}*/

			//Case 2:
			/*
			Employee[] x = (Employee[])ois.readObject();
			for(Employee w : x){
				System.out.println(w);
			}*/

			
			//Case 3:
			ArrayList x = (ArrayList)ois.readObject();
			System.out.println(x.get(0));
			System.out.println(x.get(1));
			System.out.println(x.get(2));
		}catch(IOException w){
			w.printStackTrace();
		}catch(ClassNotFoundException w){
			w.printStackTrace();
		}

		
	}
}


class Employee implements Serializable
{
	String name;
	int salary;

	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}

	public String toString(){
		return name+" - "+salary;
	}
}