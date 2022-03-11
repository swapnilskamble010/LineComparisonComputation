package line_compare;

import java.util.Scanner;

public class Line_Comparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		length1Calc();
		

	}
	public static void length1Calc() {
		float x1,y1,x2,y2;
		System.out.println("Please Enter the co-ordinates of 1st Line");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		sc.close();
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of line:" + Math.round(length1*100.0)/100.0);
		
		
		
	}
}
