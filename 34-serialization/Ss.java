class Tt
{
	int y = 9;
}

class Ss extends Tt
{
	int y = 90;

	public static void main(String[] args) 
	{
		Ss x = new Ss();
		x.go();
	}

	void go(){

		System.out.println(this.toString());
		System.out.println(super.toString());
	}
}
