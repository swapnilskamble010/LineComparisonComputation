package line_compare;

import java.util.Scanner;

public class Line_Comparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		
		//caculating length of line 1
		float x1,y1,x2,y2;
		System.out.println("Please Enter the co-ordinates of 1st Line");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of line1 = " + Math.round(length1*100.0)/100.0);	
		
		//calculating length of line 2
		float x3,y3,x4,y4;
		System.out.println("Please Enter the co-ordinates of 2nd Line");
		x3 = sc.nextFloat();
		y3 = sc.nextFloat();
		x4 = sc.nextFloat();
		y4 = sc.nextFloat();
		sc.close();
		double length2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		System.out.println("Length of line2 = " + Math.round(length2*100.0)/100.0);
		
		//comparison of lines
		if (length1 > length2) {
			System.out.println("Length of line1 is greater than Length of line2");
		}
		else if (length1 < length2) {
			System.out.println("Length of line1 is less than Length of line2");
		}
		else {
			System.out.println("Length of line1 is equal to Length of line2");	
		}
			

	}
	

}
