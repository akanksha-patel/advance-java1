import java.io.*;

class F1{
	public static void main(String[] args){
		File f = new File("sv2.txt");

		try{
			FileInputStream fi = new FileInputStream(f);
		
			ObjectInputStream oi = new ObjectInputStream(fi);

			Reservation r = (Reservation)oi.readObject();

			//System.out.println(r.s.dtTm);
			//System.out.println(r.p);
			System.out.println(r.s.b.seatCount);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}