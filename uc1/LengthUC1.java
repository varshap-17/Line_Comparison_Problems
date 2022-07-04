package examples;

import java.util.Scanner;

public class LengthUC1 {
	
	public static void length_of_line() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1");
		double x1=sc.nextDouble();
		System.out.println("enter the value of x2");
		double x2=sc.nextDouble();
		System.out.println("enter the value of y1");
		double y1=sc.nextDouble();
		System.out.println("enter the value of y2");
		double y2=sc.nextDouble();
		double diff=x2-x1;
		double diff2=y2-y1;
		double lengthofline=Math.sqrt((diff*diff) + (diff2*diff) );
		System.out.println("Length of line is = " +lengthofline);
	}
	public static void main(String[] args) {
		length_of_line();
	}
}
