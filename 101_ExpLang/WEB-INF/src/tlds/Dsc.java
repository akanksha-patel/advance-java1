package tlds;

public class Dsc
{
	public static String dscToDo(String price){
		int pr = Integer.parseInt(price);
		return pr<=400?"Buy The Book":(pr>=600?"Don't Buy The Book":"I'll tell you later");
	}
}