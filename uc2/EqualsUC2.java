package examples;

public class EqualsUC2 {
	public static void equal_method() {
		String s1="javatpoint is a tutorial point";  
		String s2="javatpoint is a tutorial point";  
		String s3="javatpoint is a TUTORIAL POINT";  
		String s4="python";  
		System.out.println(s1.equals(s2)); //true because content and case is same  
		System.out.println(s1.equals(s3)); //false because case is not same  
		System.out.println(s1.equals(s4)); //false because content is not same
	}
	public static void main(String[] args) {
		equal_method();
	}
}
