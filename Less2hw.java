package com.gmail.kh;
import java.util.Scanner;
public class Less2hw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpit first side(a)");
		double a = sc.nextDouble();
		System.out.println("Inpit second side(b)");
		double b = sc.nextDouble();
		System.out.println("Inpit third side(c)");
		double c = sc.nextDouble();
		double p = (a + b + c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	    System.out.println("Square of triangle = " + s);

	}

}
