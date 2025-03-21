package Session3;

public class constoverload {
	
	private String ename;
	private int eno;
	private String address;
	
	public constoverload(String ename,int eno,String address) {
		this.ename=ename;
		this.eno=eno;
		this.address=address;
	}
	
	public constoverload(String ename,int eno) {
		this(ename,eno,null);
	}
	
	public constoverload(String ename,String address) {
		this(ename,0,address);
	}
	
	void displayemp() {
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.address);
	}
	
	
	
	public static void main(String[] args) {
		constoverload obj = new constoverload("employe",10,"abc city");
		constoverload obj1 = new constoverload("manager",10);
		constoverload obj2 = new constoverload("leader","xyz city");


		obj.displayemp();
		obj1.displayemp();
		obj2.displayemp();

	}
}
