package Session3;

public class advancestr {
	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("hello");
		//append
		sb.append("world");
		System.out.println(sb);
		
		//insert
		sb.insert(4,"-");
		System.out.println(sb);
		
		//replace
		sb.replace(5, 11,"welcome");
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
	
	
	}
}
