import java.io.*;

class H{
	public static void main(String[] args){
		File f = new File("sv3.txt");

		try{
			FileInputStream fi = new FileInputStream(f);
		
			ObjectInputStream oi = new ObjectInputStream(fi);

			Reservation r = (Reservation)oi.readObject();

			//System.out.println(r.s.dtTm);
			System.out.println(r.p.name+" - "+r.p.mobile);
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}