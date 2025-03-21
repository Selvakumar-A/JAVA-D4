package Session3;

public class constructor {
	public constructor()//default constructor
	{
		System.out.println("default constructor");
	}
	
	public constructor(String a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		
		constructor cont = new constructor();
		constructor con = new constructor("welcome",20);
		System.out.println("value of a + b = "+con.sum(2, 3));
		
		
	}
}
