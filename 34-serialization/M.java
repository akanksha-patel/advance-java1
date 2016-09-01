import java.io.*;

class M 
{
	public static void main(String[] args) 
	{
		File f = new File("dir1");
		delAll(f);
		
		System.out.println("Hello World!");
	}

	public static void delAll(File f){
		if(f.exists()){
			System.out.println(f);
			if(f.isDirectory()){
				String[] fls = f.list();
				for(String x : fls){
					File o = new File(f,x);
					delAll(o);
				}
			}
			
			f.delete();		
		}
	}
}
