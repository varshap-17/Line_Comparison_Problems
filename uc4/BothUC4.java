package examples;

public class BothUC4 {
	public static final String s1="equal";
	public static final String s2="EQUAL";
	public static final String s3="compare";
	public static final String s4="compare";
	public static final String s5="ampire";
	
	public static void equal_method() {
		System.out.println(s1.equals(s2)); //false because case is not same  
		System.out.println(s4.equals(s3)); //true because its same  
		System.out.println(s1.equals(s4)); //false because lower
	}
	public static void compareTo_method() {
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2)); //both are equal with ignore case
		System.out.println(s1.compareTo(s2)); //fully upper case
		System.out.println(s1.compareTo(s4)); //because c is greater than e
		System.out.println(s1.compareTo(s5)); //not same
	}
	public static void main(String[] args) {
		System.out.println("Using equals method");
		equal_method();
		System.out.println("Using compareTo mehtod");
		compareTo_method();
	}
}
