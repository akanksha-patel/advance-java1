import java.io.*;

class E1{
	public static void main(String[] args){
		Bus a1 = new Bus();
		a1.num = "MP20KD3456";
		a1.seatCount = 45;

		Schedule a2 = new Schedule();
		a2.b = a1;
		a2.dtTm = "23-July-2013 12:34pm";

		Passenger a3 = new Passenger();
		a3.name = "mohan";
		a3.mobile = "89898989898";

		Reservation a4 = new Reservation();
		a4.s = a2;
		a4.p = a3;

		File f = new File("sv2.txt");

		try{
			FileOutputStream fo = new FileOutputStream(f);

			ObjectOutputStream oo = new ObjectOutputStream(fo);

			oo.writeObject(a4);

			oo.flush();
			oo.close();
		}catch(IOException	e){
			e.printStackTrace();
		}
		
	}
}



class Reservation implements Serializable
{
	Schedule s;
	transient Passenger p;
}

class Schedule implements Serializable
{
	Bus b;
	String dtTm;
}

class Bus implements Serializable
{
	String num;
	transient int seatCount;
}

class Passenger /*implements Serializable*///not able to implements serializable
{
	String name;
	String mobile;
}
