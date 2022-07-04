package examples;

public class compareUC3 {
	public static void compareTo() {
		String s1="compare";
		String s2="compare";
		String s3="COMPARE";
		String s4="ampire";
		String s5="flag";
		System.out.println(s1.compareTo(s2)); //both are equal
		System.out.println(s1.compareToIgnoreCase(s3)); //both are equal with ignore case
		System.out.println(s1.compareTo(s3)); //fully upper case
		System.out.println(s1.compareTo(s4)); //because a is greater than c
		System.out.println(s1.compareTo(s5)); //because c is lower than f
	}
	public static void main(String[] args) {
		compareTo();
	}
}
