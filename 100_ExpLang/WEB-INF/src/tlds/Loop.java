package tlds;

public class Loop
{
	public static String loopElms(String[] arr){
		String tmp = "";

		for(String str : arr){
			tmp = tmp + "<h1>" +str+ "</h1>";
		}

		return tmp;
	}
}