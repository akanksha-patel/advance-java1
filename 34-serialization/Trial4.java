import java.io.*;
import java.util.Date;

class Passenger
{
	String name;
	String mobile;
}

class Reservation implements Serializable
{
	transient Schedule sch;
	transient Passenger psg;
	int y = 12;	
	
	private void writeObject(ObjectOutputStream os){
		try{			
			os.writeObject(sch.bs.bsNo);
			os.writeObject(sch.dt);
			os.defaultWriteObject();			
			os.writeObject(psg.name);
			os.writeObject(psg.mobile);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi){
		try{			
			sch = new Schedule();
			psg = new Passenger();
			sch.bs = new Bus();
			sch.bs.bsNo = (String)oi.readObject();
			sch.dt = (Date)oi.readObject();
			oi.defaultReadObject();
			psg.name = (String)oi.readObject();
			psg.mobile = (String)oi.readObject();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}

class Schedule
{
	Bus bs;
	Date dt;
}

class Bus
{
	String bsNo;
}


class Trial4 
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
