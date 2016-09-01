import java.io.*;
class Z
{
	float f = 34f;
	byte r;

	Z(){
		System.out.println("Super Constructor Called");
	}
}

class A extends Z implements Serializable 
{
	int a = 23;
	String str = "mohan";
	boolean b;

	A(){		
		System.out.println("Constructor Called");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();

		a1.a = 45;
		a1.str = "ganesh";
		a1.b = true;
		a1.f = 90.23456f;
		a1.r = 1;

		System.out.println("Before: "+a1.a+" "+a1.str+" "+a1.b+" "+a1.f+" "+a1.r);
		try{
			FileOutputStream fl = new FileOutputStream("abc.txt");
			ObjectOutputStream os = new ObjectOutputStream(fl);
			os.writeObject(a1);
			os.close();
		}catch(Exception e){	}
		
		A x = null;
		try{
			FileInputStream fi = new FileInputStream("abc.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			x = (A)oi.readObject();
		}catch(Exception e){}
		System.out.println("After: "+x.a+" "+x.str+" "+x.b+" "+x.f+" "+x.r);

		System.out.println("Hello World!");
	}
}
