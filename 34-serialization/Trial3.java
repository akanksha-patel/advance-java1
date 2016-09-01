import java.io.*;
import java.util.Date;

class Passenger implements Serializable
{
	String name;
	String mobile;
}

class Reservation implements Serializable
{
	Schedule sch;
	Passenger psg;
	int y = 12;	

}

class Schedule implements Serializable
{
	Bus bs;
	Date dt;
}

class Bus implements Serializable
{
	String bsNo;
}


class Trial3 
{
	public static void main(String[] args) 
	{
		Reservation r = new Reservation();
		
		Passenger p = new Passenger();
		p.name = "mohan";
		p.mobile = "8574859652";

		Bus b = new Bus();
		b.bsNo = "MP 20 KD 4578";

		Schedule s = new Schedule();
		s.bs = b;
		s.dt = new Date();

		r.sch = s;
		r.psg = p;


		File f = new File("kkr.txt");

		try{
			f.createNewFile();
			
			System.out.println("Schedule: Bus-"+r.sch.bs.bsNo+"\n"
										+" Date- "+r.sch.dt+"\n\n"
										+"Passenger: name- "+r.psg.name+"\n"
										+" mobile- "+r.psg.mobile);

			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(r);
			
			oo.close();
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("----------------------------------");
		try{
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);			
			Reservation r2 = (Reservation)oi.readObject();

			System.out.println("Schedule: Bus-"+r2.sch.bs.bsNo+"\n"
										+" Date- "+r2.sch.dt+"\n\n"
										+"Passenger: name- "+r2.psg.name+"\n"
										+" mobile- "+r2.psg.mobile);

			oi.close();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		System.out.println("Hello World!");
	}
}
