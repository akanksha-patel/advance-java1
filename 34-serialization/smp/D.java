import java.io.*;

class Employee implements Serializable
{
	String name;
	transient int age = 9;
	transient Department dpt;
}

class Department 
{
	String dptType;
	String dptHead;
}


class D 
{
	public static void main(String[] args) 
	{
		Department dp = new Department();
		dp.dptType = "Arms";
		dp.dptHead = "Mr. Battar";

		Employee emp = new Employee();
		emp.name = "Mohan";
		emp.age = 45;
		emp.dpt = dp;

		try{
			FileOutputStream fo = new FileOutputStream("obj.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(emp);
		
			oo.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		
		try{
			FileInputStream fi = new FileInputStream("obj.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Employee x = (Employee)oi.readObject();
			
			System.out.println(x.name);
			System.out.println(x.age);
			System.out.println(x.dpt);
			
			oi.close();
		}catch(Exception e){
			e.printStackTrace();		
		}	
		
	}
}
