import java.io.*;

class Employee implements Serializable
{
	String name;
	int age;
	transient Department dept;

	private void writeObject(ObjectOutputStream oo){
		try{
			oo.defaultWriteObject();
			oo.writeObject(dept.deptNm);
			oo.writeObject(dept.designation);
		}catch(IOException i){
			i.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi){
		try{
			oi.defaultReadObject();
			dept = new Department();
			dept.deptNm = (String)oi.readObject();
			dept.designation = (String)oi.readObject();
		}catch(IOException i){
			i.printStackTrace();
		}catch(ClassNotFoundException i){
			i.printStackTrace();
		}
	}
}

class Department
{
	String deptNm;
	String designation;

	public String toString(){
		return deptNm+" - "+designation;
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Department d = new Department();
		d.deptNm = "Purchase";
		d.designation = "Manager";

		Employee e = new Employee();
		e.name = "Mohan";
		e.age = 45;
		e.dept = d;


		File f = new File("abc.txt");	
		try{
			f.createNewFile();

			System.out.println("Before:");
			System.out.println("EmpNm: "+e.name);
			System.out.println("EmpAge: "+e.age);
			System.out.println("Dept: "+e.dept);


			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(e);
			
			oo.close();
		}catch(IOException x){
			x.printStackTrace();
		}


		System.out.println("--------------------------------------");
		//----------------------------------------------------------
		try{
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Employee emp = (Employee)oi.readObject();
			
			System.out.println("After:");
			System.out.println("EmpNm: "+emp.name);
			System.out.println("EmpAge: "+emp.age);
			System.out.println("Dept: "+emp.dept);
		}catch(ClassNotFoundException x){
			x.printStackTrace();
		}catch(IOException x){
			x.printStackTrace();
		}

		
		//System.out.println("Hello World!");
	}
}
